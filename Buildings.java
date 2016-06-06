
public class Buildings extends BuildingDetails {

	public static void main(String[] args) {
		
		Buildings bd = new Buildings();
		
		System.out.println("Building 1 Details : ");
		System.out.println("Building Name : " + bd.nameBldg1);
		System.out.println("Building Floor : " + bd.floorBldg1);
		System.out.println("Building Location : " + bd.locationBldg1);
		System.out.printf("Building Price per Flat : %.0f\n", bd.priceBldg1Flat);
		System.out.println("************************************");
		System.out.println("Building 2 Details : ");
		System.out.println("Building Name : " + bd.nameBldg2);
		System.out.println("Building Floor :" + bd.floorBldg2);
		System.out.println("Building Location : " + bd.locationBldg2);
		System.out.printf("Building Price per Flat : %.0f\n", bd.priceBldg2Flat);
		
		
		}
	
}
