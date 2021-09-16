class Hi{
void show()
{
for(int i=0;i<5;i++)
{
try{
Thread.sleep(500);
System.out.println("Hi");
}
catch(Exception e)
{
//e.printTrace();
}
}
}
}
class Hello
{
void show()
{
try{
for(int i=0;i<5;i++)
{
Thread.sleep(500);
System.out.println("Hello");
}
}
catch(Exception e)
{
}
}
}
class mainThread{
public static void main(String args[])
{
Hi obj1=new Hi();
Hello obj2=new Hello();
obj1.show();
obj2.show();
}
}