package by.epamtc.divoninsky.selector.dao.creator;

import by.epamtc.divoninsky.selector.entity.Appliance;
import by.epamtc.divoninsky.selector.entity.Speakers;

import java.util.Map;

public class SpeakersCreator implements ApplianceCreator {
    @Override
    public Appliance create(Map<String, String> parameters) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(parameters.get("POWER_CONSUMPTION"));
        speakers.setNumberOfSpeakers(parameters.get("NUMBER_OF_SPEAKERS"));
        speakers.setFrequencyRange(parameters.get("FREQUENCY_RANGE"));
        speakers.setCordLength(parameters.get("CORD_LENGTH"));
        return speakers;
    }
}
