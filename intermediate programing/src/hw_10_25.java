
public class hw_10_25 {

	public static void main(String[] args) {
		String str= "Create a whole new world";

		String []temp;

		String delimiter= " ";



		temp=str.split(delimiter);

		for(int i = 0;i<temp.length;i++)
		{


		    if(i == 0){
		        System.out.printf("[");
		    }

		    System.out.printf(temp[i]);

		    if(i != temp.length - 1){
		    System.out.printf(", " + delimiter + ", ");
		    }
		    if(i == temp.length - 1){
		        System.out.printf("]");

		    }

		}


		    }

}
