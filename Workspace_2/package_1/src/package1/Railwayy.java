package package1;

public class Railwayy {
	public static void main(String[] args) {
		
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");
		System.out.println("-----------------------------------------------");
		System.out.println("# code    station           Arr.       Dep.");
		System.out.println("-----------------------------------------------");
		Railway[] transactions = {
				new Railway(1,"YPR","Yasvantpur Jn","11:00","23:40"),
				new Railway(2,"GTL","Guntakal Jn","03:45","03:50"),
				new Railway(3,"YPR","Sekandrabad Jn","08:55","9:00"),
				new Railway(4,"YPR","Balharshah Jn","13:30","13:35"),
				new Railway(5,"YPR","HabibGanj Jn","21:20","23:40"),
				new Railway(6,"YPR","Jhansi Jn","01:15","23:40")
				};
		for (Railway transaction : transactions) {
			transaction.printStatement();
		}

}
}
