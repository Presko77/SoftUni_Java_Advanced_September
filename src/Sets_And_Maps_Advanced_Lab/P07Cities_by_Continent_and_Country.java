package Sets_And_Maps_Advanced_Lab;

import java.util.*;

public class P07Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputsCount = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> continentCountryCapitalMap = new LinkedHashMap<>();
        for (int i = 0; i < inputsCount; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String continent = inputData[0];
            String country = inputData[1];
            String city = inputData[2];
            continentCountryCapitalMap.putIfAbsent(continent, new LinkedHashMap<>());
            continentCountryCapitalMap.get(continent).putIfAbsent(country, new ArrayList<>());
            continentCountryCapitalMap.get(continent).get(country).add(city);
        }

        continentCountryCapitalMap.forEach((continent, country) -> {
            System.out.printf("%s:%n", continent);
            country.forEach((name, cities) -> System.out.printf("  %s -> %s%n",
                    name,
                    String.join(", ", cities)));
        });
    }
}