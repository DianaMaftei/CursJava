public class TryWithoutResources
{
    public static void main(String... args) {
        
        Resource1 r1 = null;
        Resource2 r2 = null;
        
        try {
            r1 = new Resource1(); 
            r2 = new Resource2(r1);
            
            {
            int i = 3;
            }
            
            i = 5;
            
            // use resources
        } catch(Exception e) {
            // do something
        } finally {
            if(r2 != null) {  
                try{
                    r2.close();
                    
                    if(r1 != null) {
                        try{
                            r1.close();
                        } catch (Exception e){
                            //
                        }
                    }
                } catch (Exception e){
                    ///
                }
            }           
        }      
    }
}
