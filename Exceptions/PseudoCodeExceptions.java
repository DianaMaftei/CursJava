public class PseudoCodeExceptions

{
    // access website
    if(website was access) {
        // login
        if(login was successful) {
            // open blog post
            // post comment
            if(post was successful) {
                // yeey!
            } else {
                //try again
            }
        } else  {
            // ask for password again
        }
    
    } else {
    // retry to access page
}
    
}


try {
    // access website
    // login
    // open blog post
    // post comment
} catch(WebsiteUnavailableException) {
    // 
} catch (UnsuccessfulLoginException) {
    // 
} catch (DatabaseConnectionException) {
    //
}
