class July7 extends Exception{
    static void main() {
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