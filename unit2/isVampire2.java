// what Quiz 2 will probably look like
public class isVampire2
{
   public static void main (String[] args)
   {
   }
   public static boolean isVampire2(float hour, boolean awake)
        {
            if ((!awake && (hour >= 6 && hour <= 22)) || (awake && hour < 6 && hour > 22))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    
}

// is this correct? (check with briley)