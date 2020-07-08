import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("appliances_db.txt");
        Scanner sc = new Scanner(fileReader);
        ProductContainer productContainer = new ProductContainer();
        List<String> allLines = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                continue;
            }
            allLines.add(line
                    .trim()
                    .replaceAll(" ", "")
//                    .replaceAll(",", "")
                    .replaceAll("[^A-z]+_", ""));
        }


        ArrayList<String> sortedString = new ArrayList<>();

        for (String allLine : allLines) {
            if (allLine.startsWith("TabletPC")) {
                sortedString.add(allLine);
            }
        }
        printList(sortedString);

        for (int i = 0; i < sortedString.size(); i++) {
            String line = sortedString.get(i);
            if (line.contains("MEMORY_ROM=8000")){
                Map<String, String> map = new HashMap<>();
                String paramsOfProduct = line.replaceAll("TabletPC:", "");

                String[] split = paramsOfProduct.split(",");
                for (int j = 0; j < split.length; j++) {
                    String[] split1 = split[j].split("=");
                    for (int k = 0; k < split1.length; k++) {
                        map.put(split1[0], split1[1]);

                    }
                }
//                System.out.println(map);
                TabletPC tabletPC = new TabletPC();
                tabletPC.name = "TabletPC";
                tabletPC.setBATTERY_CAPACITY(map.get("BATTERY_CAPACITY"));
                tabletPC.setCOLOR(map.get("COLOR"));
                tabletPC.setDISPLAY_INCHES(map.get("DISPLAY_INCHES"));
                tabletPC.setFLASH_MEMORY_CAPACITY(map.get("FLASH_MEMORY_CAPACITY"));
                tabletPC.setMEMORY_ROM(map.get("MEMORY_ROM"));

                System.out.println(tabletPC.toString());

//                System.out.println(paramsOfProduct);
            }
        }



//            String[] s = lines.get(j).split(" ");
//            Product product = productContainer.getProductsMap().get(s[0]);
//            System.out.println(s[0] + " " + product.getClass());
    }

    private static void printList(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}

