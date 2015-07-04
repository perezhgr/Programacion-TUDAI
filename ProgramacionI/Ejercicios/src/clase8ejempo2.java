public class clase8ejempo2 {

	final static int MAX = 10;

		public static void main(String args[]) {

			int B[]=new int[MAX];

			for (int con = 0 ; con < MAX; con++) {
				B[con]=(int) (MAX*Math.random() + 1);//Entre 1 y 10(inclusive)
			}
			
			for (int con = 0 ; con < MAX; con++) {
				System.out.println(B[con]);
			}

			System.out.println("El promedio es: "+promedio(B));
		}

		public static float promedio (int[] arr){

			float sum = 0.0f;

			for (int con = 0 ; con < MAX; con++) {
				sum += arr[con];
			}

			return sum/MAX;
		}
}
