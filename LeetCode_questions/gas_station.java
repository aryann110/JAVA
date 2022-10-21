package leetcode;

public class gas_station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []gas= {1,2,5,3,5};
		int[]cost= {3,4,3,4,2};
		System.out.println(station(gas,cost));
	}
public static int station(int[]gas,int[]cost) {
	int tc=0;
	int curr=0;
	int si=0;
	for (int i = 0; i < cost.length; i++) {
		tc=tc+gas[i]-cost[i];
		curr=gas[i]-cost[i];
		
		if(curr<0) {
			curr=0;
			si=i+1;
			
		}
	}
	if(tc<0) {
		return-1;
	}
	return si;
}
}
