class July7 extends Exception{
    static void main()  {
        try {
            checkAttendance(69);
        } catch (July7 e) {
            throw new RuntimeException(e);
        }
    }

    static void checkAttendance (int percentage) throws July7{
        July7 lae = new  July7();
        if (percentage <70){
            throw lae;
        }
    }
}
//class July7  extends Exception{
//    public July7(String mes){
//                super(mes);
//    }
//
//
//  public static   void main (String[] args){
//        try {
//            checkAttendance(90);
//        }
//        catch (July7 e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public  static void checkAttendance(int percentage) throws July7 {
//        if (percentage < 70){
//            throw new July7("Attendance is below 70%");
//        }
//    }
////
////
////
//}

//class July7 extends  Exception {
//    public July7 (String mes){
//        super (mes);
//    }
//
//    public static void main (String[] args) {
//        try {
//            checkAttendance(67);
//        } catch (July7 e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
//            System.out.println(e.getStackTrace());
////            System.out.println(e.getMessage());
//
//        }
//    }
//
//    public static void checkAttendance (int percentage)  throws July7{
//        if (percentage <75){
//            throw  new July7 ("Attendance is very low");
//        }
//    }
//}