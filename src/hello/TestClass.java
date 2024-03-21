package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
		int carPark = 0;
		int firstTime = 10;
		int secoundTime = 15;
		for (int i = 0; i < parkingStartEndTimes.length; i++) {

			int arsTime[] = parkingStartEndTimes[i];
			int timeOfPark = arsTime[1] - arsTime[0];
			if (timeOfPark == firstTime || timeOfPark == secoundTime) {
				carPark++;
			}
		}
		return carPark;

	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}