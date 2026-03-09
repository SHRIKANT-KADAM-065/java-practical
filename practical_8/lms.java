import java.util.Scanner;

class newBook {

    String bookId;
    String bookName;

    newBook(String bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

class issueBook {

    String name;
    String bookId;

    issueBook(String name, String bookId) {
        this.name = name;
        this.bookId = bookId;
    }
}

class returnBook {

    String bookId;

    returnBook(String bookId) {
        this.bookId = bookId;
    }
}

class management {

    void displayBooks(newBook[] book, int count) {

        for(int i=0;i<count;i++) {
            System.out.println("BookId: " + book[i].bookId);
            System.out.println("BookName: " + book[i].bookName);
        }
    }

    void displayIssue(issueBook[] issue, int count) {

        for(int i=0;i<count;i++) {
            System.out.println("Name: " + issue[i].name);
            System.out.println("BookId: " + issue[i].bookId);
        }
    }

    void displayReturn(returnBook[] returned, int count) {

        for(int i=0;i<count;i++) {
            System.out.println("Returned BookId: " + returned[i].bookId);
        }
    }
}

class libraryManagementSystem {

    static int count1 = 0;
    static int count2 = 0;
    static int count3 = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        newBook[] book = new newBook[60];
        issueBook[] issue = new issueBook[100];
        returnBook[] returned = new returnBook[100];

        management m = new management();

        char input;

        do {

            System.out.println("\nEnter N for new book");
            System.out.println("Enter I for issue book");
            System.out.println("Enter R for return book");
            System.out.println("Enter D for display");
            System.out.println("Enter E for exit");

            input = sc.next().charAt(0);

            switch(input) {

                case 'N': {

                    sc.nextLine();

                    System.out.println("Enter bookId:");
                    String bookId = sc.nextLine();

                    System.out.println("Enter bookName:");
                    String bookName = sc.nextLine();

                    book[count1] = new newBook(bookId, bookName);
                    count1++;

                    break;
                }

                case 'I': {

                    sc.nextLine();

                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter bookId:");
                    String bookId = sc.nextLine();

                    issue[count2] = new issueBook(name, bookId);
                    count2++;

                    break;
                }

                case 'R': {

                    sc.nextLine();

                    System.out.println("Enter bookId:");
                    String bookId = sc.nextLine();

                    returned[count3] = new returnBook(bookId);
                    count3++;

                    break;
                }

                case 'D':

                    m.displayBooks(book, count1);
                    m.displayIssue(issue, count2);
                    m.displayReturn(returned, count3);

                    break;

                case 'E':

                    System.out.println("Exit");
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } while(input!='E');
    }
}