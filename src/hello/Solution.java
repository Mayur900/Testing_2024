package hello;
import java.util.*;

public class Solution {
    public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {
       static HashMap<String, Integer> mapWithRating = new HashMap<String, Integer>();
       static HashMap<String, Double> mapWithAvg = new HashMap<String, Double>();
       
        @Override
        public void putNewRating(String app, int rating){
            
        	if(mapWithRating.isEmpty() || !mapWithRating.containsKey(app)) {
        		mapWithRating.put(app, 1);
        	}else {
        		if(mapWithRating.containsKey(app)) {
                	int oldRating = mapWithRating.get(app);
                	oldRating++;
                	mapWithRating.put(app, oldRating);
                }
        	}
        	
            if(mapWithAvg.isEmpty() || !mapWithAvg.containsKey(app)) {
            	mapWithAvg.put(app, (double) rating);

            }else {
            if(mapWithAvg.containsKey(app)) {
            	double oldAvg = mapWithAvg.get(app);
            	oldAvg += rating;
            	mapWithAvg.put(app, oldAvg);
            }
            }

        }

        @Override
        public double getAverageRating(String app){
			double avg = mapWithAvg.get(app) / mapWithRating.get(app);
        	return avg;
        }

        @Override
        public int getRatingsCount(String app){
			return mapWithRating.get(app);
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingStatisticsCollector {
        // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
        public void putNewRating(String app, int rating);

        // Report the average rating of the app. 
        public double getAverageRating(String app);

        // Report the total number of rating for an app.
        public int getRatingsCount(String app);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
            final Set<String> apps = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String app = tokens[0];
                apps.add(app);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewRating(app, runs);

            }

            for (String app : apps) {
                System.out.println(
                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            }

        }
        scanner.close();

    }
}