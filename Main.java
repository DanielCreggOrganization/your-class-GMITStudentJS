class main {
    public static void main(String[] args) {
        Human humanobj1 = new Human();
        Human humanobj2 = new Human();

        System.out.println();

        humanobj1.age=40;
        humanobj1.haircolour= "red";
        humanobj1.weight=11.1;
        humanobj1.printAge();
        humanobj1.reduceAge();
        
        System.out.println("He is "+humanobj1.age+" years old.");
        System.out.println("He has "+humanobj1.haircolour+" hair.");
        System.out.println("He is "+humanobj1.weight+" stone.");

        System.out.println();

        humanobj2.age=30;
        humanobj2.haircolour= "blonde";
        humanobj2.weight=8;
        humanobj2.printAge();
        humanobj2.reduceAge();
        
        System.out.println("She is "+humanobj2.age+" years old.");
        System.out.println("She has "+humanobj2.haircolour+" hair.");
        System.out.println("She is "+humanobj2.weight+" stone.");


    }
}