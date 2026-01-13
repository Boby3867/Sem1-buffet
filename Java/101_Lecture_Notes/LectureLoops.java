/*
    Lecture note example - Loops!!
*/

class LectureLoops{
    public static void main(String args[]) {
        int x = 0;
        int pow = 1;
        while(true){
            if(x >= 20){
                break;
            }
            pow = pow * 5;
            System.out.println(pow);
            x = x + 1;
        }
	}
}
