class FunctionTest
{
	public static void main(String[] args){
		int[] x = new int[3];
		int[] y=x;
		y[1]=89;
		System.out.println(x[1]);
		
		
/*
	draw(5,6);
	printHr();
	draw(7,8);
	printHr();
	System.out.println(add(1,2));
	System.out.println(add(1,2,3));
	print99();
	printHr();
	print99(5);
*/
	}
	public static void draw(int row,int clo){//��ӡ����
		for(int x=0;x<row;x++){
			for(int y=0;y<clo;y++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void printHr(){
		System.out.println("--------------------");
	}
	//
	public static void print99(){//�˷��ھ�
		for(int y=1;y<=9;y++){
			for(int x =1;x<=y;x++)
				System.out.print(x+"*"+y+"="+x*y+" ");
			System.out.println();
		}
	}
	public static void print99(int a){//�˷��ھ�:�������
		for(int y=1;y<=a;y++){
			for(int x =1;x<=y;x++)
				System.out.print(x+"*"+y+"="+x*y+" ");
			System.out.println();
		}
	}
	public static int add(int x,int y){//��ͣ�����ĺ����Ǹú���������
		return x+y;
	}
	public static int add(int x,int y,int z){
		return x+y+z;
	}
}