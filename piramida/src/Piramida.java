public class Piramida {
	public static void main(String[] args) {
		double randomBroj = (0 + (Math.random()) * (50 - 0 + 1)); // Random derivat sa opsegom 0-50
		double pyramidL = randomBroj; // Length
		double pyramidH = randomBroj; // Height
		double pyramidW = randomBroj; // Width

		double povrsinaPiramide = pyramidL * pyramidW +              //
				pyramidL * Math.sqrt((pyramidW / 2) * (pyramidW / 2) //
						+ pyramidH * pyramidH) +                     // Formula za racunanje
				pyramidW * Math.sqrt((pyramidL / 2) * (pyramidW / 2) //
						+ pyramidH * pyramidH);

		System.out
				.println("Random broj koji se koristi za sirinu visinu i duzinu je: "
						+ randomBroj);
		System.out.println("Povrsina piramide je: " + povrsinaPiramide);
		System.out.println("Zapremina piramide je: "
				+ (pyramidL * pyramidH * pyramidW) / 3); // Ispis sa kalkulacijom zapremine
	}
}