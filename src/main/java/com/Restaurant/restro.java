public class Inheritance {

    public static class user{
        String name;
        String city;

        // void advertisement(){
        //     System.out.println("Many Adds");
        // }
        user(String name , String city){
            this.name = name;
            this.city = city;
        }
        user(){

        }
    }

    public static class RegUser extends user{
        String email;
        int phoneNumber;
        // @Override
        void advertisement(){
            System.out.println("less adds");
        }
        RegUser(String name , String city , String email , int phoneNumber){
            // super( name , city ); // super keyword is reference variable that is pointing to immeadiate parent-----------------------
            // In the first line we have to call this super function----------------------------------
            // so we will cal it over here---------------
            // and also at a time we can call only one constructor---------
            super( name , city );
            // super();

            this.email = email;
            this.phoneNumber = phoneNumber;
        }
        RegUser(){

        }
    }

    public static class subUser extends RegUser{
        String planValidity;
        @Override // Dyanamic binding..................It is optional----------- 
        void advertisement(){
            System.out.println("No adds");
        }
        subUser(String name , String city , String email , int phoneNumber , String planValidity){
            super(name , city , email , phoneNumber);
            super.email = "harshsikarwar463@gmail.com"; // It will update my email..............
            super.advertisement(); // It will print "many adds"--------
            // condition is properties should not be private---------------
            this.planValidity = planValidity;
        }
        subUser(){

        }

        // we can we create object of subClass/child class 
        // order of invocation (calling) :- Child to parent
        // order of implementaion :- parent to child
    }

    public static void main(String[] args) {

        System.out.println();

        subUser su = new subUser("Harsh" , "Gwalior" , "harshsikarwar125gmail.com" , 79995 , "1-Month");
        System.out.println(su.name);
        System.out.println(su.city);
        System.out.println(su.email);
        System.out.println(su.phoneNumber);
        System.out.println(su.planValidity);

        su.advertisement();

        System.out.println();

        RegUser Ru = new RegUser("Tejsavi" , "Kota" , "chauhantejsavi47@gmail.com" , 84260);
        System.out.println(Ru.name);
        System.out.println(Ru.city);
        System.out.println(Ru.email);
        System.out.println(Ru.phoneNumber);

        Ru.advertisement();

        System.out.println();

        
        user u1 = new RegUser(); // Accesseblity comes from left hand side and functionality comes from right hand side----------------
        // System.out.println(u1.email); 
        // this is giving us error b/c compiler is seening u1 as user but object is created of RegUser which does not have 
        
        
        // u1.advertisement();


        // Type casting ---> Down casting
        // RegUser u2 = (RegUser)(u1);
        // System.out.println(u2.email);

        System.out.println(((RegUser)u1).email); //  Dyanamic / runtime binding---------(function binded through JVM).......
        // in overloading functions are binded at compile time by compiler------------
    }
}
