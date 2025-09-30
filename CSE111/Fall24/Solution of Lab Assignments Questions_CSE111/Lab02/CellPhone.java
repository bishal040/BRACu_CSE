public class CellPhone
{
  public String model ="unknown";
  public int count = 0;
  public String[] contact = new String[3];
  public void printDetails()
  {
  System.out.println("Phone Model " + this.model);
  
  
  if(count!=0)
  {
    System.out.println("Contacts Stored " + count);
    System.out.println("Stored Contacts: ");
    for(int i = 0;i<contact.length;i++)
    {
      if(i<count)
      {
    System.out.println(contact[i]);
      }
     else{
      break;
      }
    }
  }
  else{
     System.out.println("Contacts Stored " + count);
  }
  }
  public void storeContact(String str)
  {
    if(count<=2)
    {
       contact[count]= str;
       count++;
      System.out.println("Contact Stored");
    }
    else
    {
      System.out.println("Memory full. New contact can't be stored. "); 
    }
  }
}