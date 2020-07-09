package by.epamtc.selector.services.creator;

import by.epamtc.selector.entity.Product;
import by.epamtc.selector.entity.Speakers;

import java.util.Map;

public class SpeakersCreator implements ProductCreator {
    @Override
    public Product create(Map<String, String> parameters) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(parameters.get("POWER_CONSUMPTION"));
        speakers.setNumberOfSpeakers(parameters.get("NUMBER_OF_SPEAKERS"));
        speakers.setFrequencyRange(parameters.get("FREQUENCY_RANGE"));
        speakers.setCordLength(parameters.get("CORD_LENGTH"));
        return speakers;
    }
}
