package DataStructure;

import javafx.geometry.Pos;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    // Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

    PostIt idea1 = new PostIt();
    idea1.backgroundColor = Color.orange;
    idea1.textColor=Color.blue;
    idea1.text = "Idea 1";

    PostIt awesome = new PostIt();
    awesome.backgroundColor = Color.pink;
    awesome.textColor = Color.black;
    awesome.text = "Awesome";

    PostIt superb = new PostIt();
    superb.backgroundColor = Color.yellow;
    superb.textColor = Color.green;
    superb.text = "Superb!";

    //Create a few blog post objects:
//"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
// Lorem ipsum dolor sit amet.

    BlogPost blogProject1 = new BlogPost();
    blogProject1.authorName = "John Doe";
    blogProject1.title = "Lorem Ipsum";
    blogProject1.text = " Lorem ipsum dolor sit amet.";
    blogProject1.publicationDate = "2000.05.04";

    //"Wait but why" titled by Tim Urban posted at "2010.10.10."
//A popular long-form, stick-figure-illustrated blog about almost everything.
    BlogPost blogProject2 = new BlogPost();
    blogProject2.authorName = "Tim Urban";
    blogProject2.title = "Wait but why";
    blogProject2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    blogProject2.publicationDate = "2010.10.10";

    //"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
// When I asked to take his picture outside one of IBM’s New York City offices,
// he told me that he wasn’t really into the whole organizer profile thing.
    BlogPost blogProject3 = new BlogPost();
    blogProject3.authorName = "William Turton";
    blogProject3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    blogProject3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n" +
            "When I asked to take his picture outside one of IBM’s New York City offices,\n" +
            " he told me that he wasn’t really into the whole organizer profile thing.";
    blogProject3.publicationDate = "2017.03.28"; 
  }
}





