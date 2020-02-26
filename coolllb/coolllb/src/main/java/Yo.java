import java.io.*;

class Yo
{

    public String name;
    public int id;

    Yo(String name, int id)
    {

        this.name = name;
        this.id = id;
    }
    public boolean equals(Object obj)
    {


        if(this == obj)
            return true;


        if(obj == null || obj.getClass()!= this.getClass())
            return false;


        Yo geek = (Yo) obj;


        return (geek.name == this.name && geek.id == this.id);
    }
    public int hashCode()
    {


        return this.id;
    }






    public static void main (String[] args)
    {


        Yo g1 = new Yo("aa", 1);
        Yo g2 = new Yo("aa", 1);
        if(g1.hashCode() == g2.hashCode())
        {

            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");
    }
}