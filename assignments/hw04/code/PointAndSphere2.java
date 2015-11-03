import java.util.Scanner;
public class PointAndSphere2 {
	public static void main(String[] args) {
		double[] pointCoordinates = promptCoordinates("Point");
		double[] sphereCoordinates = promptCoordinates("Sphere");
		double radius = promptRadius();
		Point point = new Point(pointCoordinates);
		Sphere sphere = new Sphere(sphereCoordinates, radius);
		double dist = sphere.coordinates.getDistance(point.coordinates);
		if (dist > sphere.radius)
			System.out.println("The point is outside the sphere.");
		else if (dist == sphere.radius)
			System.out.println("The point is on the sphere.");
		else
			System.out.println("The point is inside the sphere.");
	}
	public static double[] promptCoordinates(String name) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Coordinates of %s: ", name);
		double[] coordinates = new double[3];
		for (int i = 0; i < coordinates.length; i++)
			coordinates[i] = input.nextDouble();
		return coordinates;
	}
	public static double promptRadius() {
		Scanner input = new Scanner(System.in);
		System.out.print("Radius of Sphere: ");
		double radius = input.nextDouble();
		return radius;
	}
}
