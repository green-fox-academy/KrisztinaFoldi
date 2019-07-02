
public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String games = " - Download games\n";
        String diablo = "   - Diablo";
        String myTodo = "My todo: \n";


        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(myTodo + todoText + games + diablo);
    }
}