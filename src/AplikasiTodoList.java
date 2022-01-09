public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "model[0]";
        model[1] = "model[1]";
        showTodoList();
    }

    /**
     * Menambahkan todo ke list
     */
    public static void addTodoList(String todo) {
        // cek apakah slot di model penuh
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // model masih punya slot yang kosong
                isFull = false;
                break;
            }
        }

        // jika slot penuh, resize array 2x lipat
        if(isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Menghapus todo dari list
     */
    public static void removeTodoList() {

    }

    /**
     * Menampilkan view show todo list
     */
    public static void viewShowTodoList() {

    }

    /**
     * Menampilkan view add todo ke list
     */
    public static void viewAddTodoList() {

    }

    /**
     * Menampilkan view remove todo dari list
     */
    public static void viewRemoveTodoList() {

    }
}
