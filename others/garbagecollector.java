package others;

class Garbagecollector
    {
    // Java Program to count number
// of employees working
// in a company
        private int ID;
        private String name;
        private int age;
        private static int nextId = 1;
        // it is made static because it
        // is keep common among all and
        // shared by all objects
        public Garbagecollector(String name, int age)
        {
            this.name = name;
            this.age = age;
            this.ID = nextId++;
        }
        public void show()
        {
            System.out.println("Id=" + ID + "\nName=" + name
                    + "\nAge=" + age);
        }
        public void showNextId()
        {
            System.out.println("Next employee id will be="
                    + nextId);
        }
        protected void finalize()
        {
            --nextId;
            // In this case,
            // gc will call finalize()
            // for 2 times for 2 objects.
        }
    }
class UseEmployee
    {
        public static void main(String[] args)
        {
            Garbagecollector E = new Garbagecollector("GFG1", 56);
            Garbagecollector F = new Garbagecollector("GFG2", 45);
            Garbagecollector G = new Garbagecollector("GFG3", 25);
            E.show();
            F.show();
            G.show();
            E.showNextId();
            F.showNextId();
            G.showNextId();

            { // It is sub block to keep
                    // all those interns.
                Garbagecollector X = new Garbagecollector("GFG4", 23);
                Garbagecollector Y = new Garbagecollector("GFG5", 21);
                X.show();
                Y.show();
                X.showNextId();
                Y.showNextId();
                X = Y = null;
                System.gc();
                System.runFinalization();
            }
        /*
         After countering this brace, X and Y
         will be removed.Therefore,
         now it should show nextId as 4.
         Output of this line
        */
            E.showNextId();
            F.showNextId();
            G.showNextId();
            //X.showNextId();shows error

        // should be 4 but it will give 6 as output.
        }
    }
