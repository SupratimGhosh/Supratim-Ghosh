import java.util.*;
class snl2
{
    Scanner in=new Scanner(System.in);
    static String player[]=new String[2];
    static int dice,i,d,t;
    static int score[]={0,0};
    int x[]={2,2};
    int c[]={1,1};
    final int snake[][]={{23,3},{52,7},{55,34},{79,43},{85,45},{89,51},{95,73},{98,37}};
    final int ladder[][]={{9,50},{20,58},{27,46},{36,64},{48,92},{60,81},{63,97},{66,86}};
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        snl2 ob=new snl2();
        int n,i;
        ob.head();
        ob.left("_/\\_ _/\\_ _/\\_ _/\\_ _/\\_WELCOME_/\\_ _/\\_ _/\\_ _/\\_ _/\\_",60);
        System.out.println(); 
        ob.delay(2000);
        ob.left("..._/\\_ WELCOME TO THE WORLD OF SNAKES AND LADDERS _/\\_...",59);
        System.out.println();
        ob.delay(1000);
        ob.left("1) Play Single Player",70);
        ob.left("2) Play Multiplayer(ONLY 2)",70);
        ob.left("3) Play vrs computer",70);
        ob.left("4) Exit game",70);
        ob.left("Enter your Choice: ",70);
        ob.centerify();
        int ch=in.nextInt();
        System.out.print('\f');
        ob.head();
        switch(ch)
        {
            case 1:
            ob.left("Please Enter Your Name,",70);
            ob.centerify();
            player[0]=in.next().toUpperCase();
            ob.left("GAME STARTED.......",75);
            ob.delay(1500);
            System.out.print('\f');
            ob.StartGame();
            case 2:
            ob.left("Enter name of players",70);
            for(i=0;i<2;i++)
            {
                ob.centerify();
                player[i]=in.next().toUpperCase();
            }
            ob.left("GAME STARTED.......",75);
            ob.delay(1500);
            System.out.print('\f');
            ob.StartGame2();
            break;
            case 3:
            ob.left("Enter Your Name",70);
            ob.centerify();
            player[0]=in.next().toUpperCase();
            player[1]="Computer";
            ob.left("GAME STARTED.......",75);
            ob.delay(1500);
            System.out.print('\f');
            ob.StartGame3();
            break;
            case 4:
            ob.left("You chose to exit the game!!!",70);
            ob.left("Bye!!!Bye!!!",72);
            ob.left("EXITING.....   PLEASE WAIT.........",70); 
            ob.delay(2000);
            System.out.print('\f');
            ob.head();
            ob.left("GOOD BYE...  PLAY AGAIN..",70);
            System.exit(0);
            break;
            default:
            ob.left("You entered the wrong choice!!! Restart the program once more!!",70);
            ob.restart();
        }
    }
    static int Dice()
    {
       dice=(int)(Math.random()*7);
       if(dice!=0 && dice!=7)
       return dice;
       else 
       {
           if(dice==0)
           dice+=1;
           else
           dice-=1;
           return dice;
        }
    }
    void restart()
    {
        Scanner in=new Scanner(System.in);
        snl2 ob=new snl2();
        ob.left("########################################",70);
        ob.delay(100);
        for(int i=0;i<5;i++)
        System.out.println();
        ob.left("Press any key to continue.....!!!!!!",70);
        ob.centerify();
        String cont=in.next();
        delay(500);
        ob.left("Do you want to restart the game??? y/n",70);
        ob.centerify();
        String r=in.next();
        if(r.equalsIgnoreCase("y")){
        System.out.print('\f');
        score[0]=0;
        score[1]=0;
        d=0;t=0;
        x[0]=2;
        x[1]=2;
        c[0]=1;
        c[1]=1;
        main();}
        else
        {
            ob.left("Please wait............................",70);
            System.exit(0);
        }
    }
    void check(int j)
    {
        if(d==1 && x[j]==2){
        x[j]=1;d=1;}
        else if(d!=1 && x[j]==2)
        d=0;
    }
    void rules()
    {
        Scanner in=new Scanner(System.in);
        snl2 ob=new snl2();
        System.out.println();
        ob.left("===========================================================================",53);
        ob.delay(500);
        ob.left("-:RULES :-",85);
        ob.delay(1000);
        ob.left(" \u2023 THROW 1 TO START THE GAME.",55);
        ob.delay(1000);
        ob.left(" \u2023 IN SINGLE PLAYER MODE AND DUAL PLAYER MODE, PLAYER WILL BE DENOTED AS 'P1' & 'P2'; \n\t\t\t\t\t\t\t\t   WHEREAS IN COMPUTER-PLAYER MODE IT WILL BE 'P' & 'C';",55);
        ob.delay(3000);
        ob.left(" \u2023 EACH TIME, EACH PLAYER WILL GET ONLY ONE TIME TO ROLL.",55);
        ob.delay(1000);
        ob.left(" \u2023 LADDERS WILL PROMOTE YOUR POSITION.....       SNAKES WILL DEMOTE YOUR POSITION.....",55);
        ob.delay(1000);
        ob.left(" \u2023 THE ONE WHO WILL REACH 100 FIRST WILL WIN THE GAME.",55);
        ob.delay(1000);
        ob.left(" \u2023 IF YOU WANT TO EXIT THE GAME...  YOU CAN ENTER THE EXIT OPTION....",55);
        ob.delay(1000);
        System.out.println();
        ob.left("Do you want to see the table...?? y/n",70);
        ob.centerify();
        String ch=in.next();
        if(ch.equalsIgnoreCase("y")==true)
        ob.table();
        for(;;){
        ob.left("Press any key to continue...",75);
        ob.centerify();
        String abc=in.next();
        break;}
    }
    int snake_ladder()
    {
        int f=0;
        for(int i=0;i<8;i++)
        {
            if(score[t]==snake[i][0])
            {
                score[t]=snake[i][1];
                f=1;
            }
        }
        for(int i=0;i<8;i++)
        {
            if(score[t]==ladder[i][0])
            {
                score[t]=ladder[i][1];
                f=2;
            }
        }
        return f;
    }
    void table()
    {
        snl2 ob=new snl2();
        ob.left("            -----------TABLE-----------",65);
        int arr[][]={{100,99,98,97,96,95,94,93,92,91},{81,82,83,84,85,86,87,88,89,90},{80,79,78,77,76,75,74,73,72,71},{61,62,63,64,65,66,67,68,69,70},{60,59,58,57,56,55,54,53,52,51},{41,42,43,44,45,46,47,48,49,50},{40,39,38,37,36,35,34,33,32,31},{21,22,23,24,25,26,27,28,29,30},{20,19,18,17,16,15,14,13,12,11},{1,2,3,4,5,6,7,8,9,10}};
        int i,j;
        ob.left("_____________________________________________________________",59);
        for(i=0;i<9;i++)
        {
            for(j=0;j<10;j++)
            {
                if(arr[i][j]==100)
                System.out.print("\t\t\t\t\t\t\t    | 100 |");
                else if((score[0]==arr[i][j])&&(arr[i][j]==score[1]))
                System.out.print("P1,P2|");
                else if(score[0]==arr[i][j])
                System.out.print("  P1 |");
                else if(score[1]==arr[i][j])
                System.out.print("  P2 |");
                else
                System.out.print("  "+arr[i][j]+" |");
            }
            System.out.println();
            ob.left("-------------------------------------------------------------",59);
            System.out.print("\t\t\t\t\t\t\t    |");
        }
        i=9;
        for(j=0;j<10;j++)
        {
            if((score[0]==arr[i][j])&&(arr[i][j]==score[1]))
            System.out.print("P1,P2|");
            else if(score[0]==arr[i][j])
            System.out.print("  P1 |");
            else if(score[1]==arr[i][j])
            System.out.print("  P2 |");
            else if(arr[i][j]==10)
            System.out.print("  10 |");
            else 
            System.out.print("   "+arr[i][j]+" |");
        }
        System.out.println();
        ob.left("-------------------------------------------------------------",59);
        System.out.println();
        ob.left("|------------------------------------------------------------------------------------------------------------------------------------|",40);
        ob.left("|                                                                                                                                    |",40);
        ob.left("|SNAKES: IF YOU FALL ON THE NUMBERS YOU WILL GO DOWN        ||                  LADDERS: IF YOU FALL ON THE NUMBERS YOU WILL GO UP   |",40);
        ob.left("|23---------->3                                             ||                  09---------->50                                      |",40);
        ob.left("|52---------->7                                             ||                  20---------->58                                      |",40);
        ob.left("|55---------->34                                            ||                  27---------->46                                      |",40);
        ob.left("|79---------->43                                            ||                  36---------->64                                      |",40);
        ob.left("|85---------->45                                            ||                  48---------->92                                      |",40);
        ob.left("|89---------->51                                            ||                  60---------->81                                      |",40);
        ob.left("|95---------->73                                            ||                  63---------->97                                      |",40);
        ob.left("|98---------->37                                            ||                  66---------->86                                      |",40);
        ob.left("|                                                                                                                                    |",40);
        ob.left("|------------------------------------------------------------------------------------------------------------------------------------|",40);
        System.out.println();
    }
    void ctable()
    {
        snl2 ob=new snl2();
        ob.left("            -----------TABLE-----------",65);
        int arr[][]={{100,99,98,97,96,95,94,93,92,91},{81,82,83,84,85,86,87,88,89,90},{80,79,78,77,76,75,74,73,72,71},{61,62,63,64,65,66,67,68,69,70},{60,59,58,57,56,55,54,53,52,51},{41,42,43,44,45,46,47,48,49,50},{40,39,38,37,36,35,34,33,32,31},{21,22,23,24,25,26,27,28,29,30},{20,19,18,17,16,15,14,13,12,11},{1,2,3,4,5,6,7,8,9,10}};
        int i,j;
        ob.left("_____________________________________________________________",60);
        for(i=0;i<9;i++)
        {
            for(j=0;j<10;j++)
            {
                if(arr[i][j]==100)
                System.out.print("\t\t\t\t\t\t\t     | 100 |");
                else if((score[0]==arr[i][j])&&(arr[i][j]==score[1]))
                System.out.print(" P,C |");
                else if(score[0]==arr[i][j])
                System.out.print("  P  |");
                else if(score[1]==arr[i][j])
                System.out.print("  C  |");
                else 
                System.out.print("  "+arr[i][j]+" |");
            }
            System.out.println();
            ob.left("-------------------------------------------------------------",60);
            System.out.print("\t\t\t\t\t\t\t     |");
        }
        i=9;
        for(j=0;j<10;j++)
        {
            if((score[0]==arr[i][j])&&(arr[i][j]==score[1]))
            System.out.print(" P,C |");
            else if(score[0]==arr[i][j])
            System.out.print("  P  |");
            else if(score[1]==arr[i][j])
            System.out.print("  C  |");
            else if(arr[i][j]==10)
            System.out.print("  10 |");
            else 
            System.out.print("   "+arr[i][j]+" |");
        }
        System.out.println();
        ob.left("-------------------------------------------------------------",60);
        System.out.println();
        ob.left("|------------------------------------------------------------------------------------------------------------------------------------|",35);
        ob.left("|                                                                                                                                    |",35);
        ob.left("|SNAKES: IF YOU FALL ON THE NUMBERS YOU WILL GO DOWN        ||                  LADDERS: IF YOU FALL ON THE NUMBERS YOU WILL GO UP   |",35);
        ob.left("|23---------->3                                             ||                  09---------->50                                      |",35);
        ob.left("|52---------->7                                             ||                  20---------->58                                      |",35);
        ob.left("|55---------->34                                            ||                  27---------->46                                      |",35);
        ob.left("|79---------->43                                            ||                  36---------->64                                      |",35);
        ob.left("|85---------->45                                            ||                  48---------->92                                      |",35);
        ob.left("|89---------->51                                            ||                  60---------->81                                      |",35);
        ob.left("|95---------->73                                            ||                  63---------->97                                      |",35);
        ob.left("|98---------->37                                            ||                  66---------->86                                      |",35);
        ob.left("|                                                                                                                                    |",35);
        ob.left("|------------------------------------------------------------------------------------------------------------------------------------|",35);
        System.out.println();
    }
    void StartGame()
    {
        Scanner in=new Scanner(System.in);
        snl2 ob=new snl2();
        int x=2,ans,d,m;
        ob.head();
        ob.left("WELCOME ... ... : "+player[0],70);
        ob.rules();
        System.out.println();
        System.out.print('\f');
        ob.head();
        ob.left("============================================",60);
        ob.left("GAME HAS BEEN STARTED... "+player[0],70);  
        while(x>0)
            {
            System.out.print('\f');
            ob.head();
            t=0;
            ob.table(); 
            ob.left("Player's position: "+score[0]+"(P1)",60);
            ob.left("1. Roll the dice",70);
            ob.left("2. Exit game",70);
            ob.left("Enter your choice",67);
            ob.centerify();
            ans=in.nextInt();
            switch(ans)
            {
                case 1:
                d=Dice();
                ob.left("No. on the dice......."+dice,70);
                if(d==1 && x==2){
                x=1;}
                else if(x==2 && d!=1){
                d=0;}
                if((score[0]+d)>100)
                ob.left("Score: "+score[0],70);
                else{
                score[0]+=d;
                ob.left("Score: "+score[0],70);
                if(score[0]==100)
                {
                    ob.left(player[0]+" IS THE WINNER",70);
                    ob.restart();
                }}
                m=ob.snake_ladder();
                if(m==1){
                ob.left("SWALLOWED BY SNAKE",70);
                ob.left("New Score : "+score[0],75);}
                else if(m==2){
                ob.left("CLIMBED UP THE LADDER",70);
                ob.left("New Score : "+score[0],75);}
                ob.left("---------------------------------",70);
                break;
                case 2:
                System.out.print('\f');
                ob.head();
                ob.left("YOU CHOSE TO EXIT THE GAME!!! BYE..!!!",65);
                System.out.println();
                ob.delay(1000);
                ob.left("EXITING.....   PLEASE WAIT.........",66); 
                ob.delay(2500);
                System.exit(0);
                default:
                System.out.println();
            }
            ob.left("Press any key to continue.....",70);
            for(;;){
                ob.centerify();
            String abc=in.next();
            break;}
        }
    }
    void StartGame2()
    {
        Scanner in=new Scanner(System.in);
        snl2 ob=new snl2();
        int ans,d,m,j;
        ob.head();
        ob.left("WELCOME ... ... : "+player[0]+" && "+player[1],65);
        ob.rules();
        for(i=0;;i++){
            if(i%2==0){
            System.out.print('\f');ob.head();}
            if(i%2==0)
            ob.table();
            if(i%2==0){
            ob.left(player[0]+"'s Score: "+score[0]+"(P1)",50);
            ob.left(player[1]+"'s Score: "+score[1]+"(P2)",50);
            System.out.println();
            System.out.println();}
            if(i%2==0){
            ob.left("Player 1: "+player[0],77);j=0;t=0;}
            else{
            ob.left("Player 2: "+player[1],77);j=1;t=1;}
            System.out.println();
            ob.left("1. Roll the dice",70);
            ob.left("2. Exit game",70);
            ob.left("Enter your choice",75);
            ob.centerify();
            ans=in.nextInt();
            switch(ans)
            {
                case 1:
                d=Dice();
                ob.left("No. on the dice......."+dice,65);
                if((d==1)&&(x[j]==2))
                x[j]=1;
                if((score[j]+d)>100)
                ob.left("Score: "+score[j],70);
                else{
                    if (x[j]==2)
                    d=0;
                    else
                    score[j]+=d;
                ob.left("Score: "+score[j],70);
                if(score[j]==100)
                {
                    ob.left(player[j]+" IS THE WINNER!!!!!",70);
                    ob.restart();
                }}
                m=ob.snake_ladder();
                if(m==1){
                ob.left("SWALLOWED BY SNAKE",70);
                ob.left("New Score : "+score[j],70);}
                else if(m==2){
                ob.left("CLIMBED UP THE LADDER",70);
                ob.left("New Score : "+score[j],70);}
                ob.left("---------------------------------",60);
                break;
                case 2:
                System.out.print('\f');
                ob.head();
                ob.left("YOU CHOSE TO EXIT THE GAME!!! BYE..!!!",65);
                System.out.println();
                ob.delay(1000);
                if(i%2==0)
                ob.left(player[1]+" is the winner",70);
                else
                ob.left(player[0]+" is the winner",70);
                ob.left("EXITING.....   PLEASE WAIT.........",66); 
                ob.delay(2500);
                System.exit(0);
                default:
                System.out.println();
                i--;
            }
            if(i%2!=0){
            ob.left("Press any key to continue...",73);
            ob.centerify();
            String abc=in.next();}
            System.out.println();
        }
    }
    void StartGame3()
    {
        Scanner in=new Scanner(System.in);
        snl2 ob=new snl2();
        int ans,d,m,j;
        ob.head();
        ob.left("WELCOME ... ... : "+player[0],70);
        ob.rules();
        System.out.println();
        System.out.print('\f');
        ob.head();
        ob.left("GAME HAS BEEN STARTED... "+player[0],69);
        for(i=0;;i++){
            if(i%2==0)
            {
            ob.ctable();
            ob.left("P: "+player[0]+" ("+score[0]+")",50);
            ob.left("C: Computer ("+score[1]+")",50);
            j=0;t=0;
            System.out.println();
            ob.left("1. Roll the dice",70);
            ob.left("2. Exit game",70);
            ob.left("Enter your choice",73);
            ob.centerify();
            ans=in.nextInt();
            switch(ans)
            {
                case 1:
                d=Dice();
                ob.left("No. on the dice......."+dice,70);
                if((d==1)&&(x[j]==2))
                x[j]=1;
                if((score[j]+d)>100)
                ob.left("Score: "+score[j],70);
                else{
                    if (x[j]==2)
                    d=0;
                    else
                    score[j]+=d;
                ob.left("Score: "+score[j],70);
                if(score[j]==100)
                {
                    ob.left(player[j]+" IS THE WINNER!!!!!",70);
                    ob.restart();
                }}
                m=ob.snake_ladder();
                if(m==1){
                ob.left("SWALLOWED BY SNAKE",70);
                ob.left("New Score : "+score[j],70);}
                else if(m==2){
                ob.left("CLIMBED UP THE LADDER",70);
                ob.left("New Score : "+score[j],70);}
                ob.left("---------------------------------",65);
                break;
                case 2:
                System.out.print('\f');
                ob.head();
                ob.left("YOU CHOSE TO EXIT THE GAME!!! BYE..!!!",65);
                System.out.println();
                ob.delay(1000);
                ob.left("EXITING.....   PLEASE WAIT.........",66); 
                ob.delay(2500);
                System.exit(0);
                default:
                System.out.println();
            }
            System.out.println();
            }
            else
            {ob.computer();
             ob.left("Press any key to continue...",73);
             ob.centerify();
             String abc=in.next();
             System.out.print('\f');
             ob.head();}
        }
    }
    void computer()
    {
        snl2 ob=new snl2();
        int m;
        int d=ob.Dice();
        ob.left("Computer: No. on dice....:"+d,70);
        if((d==1)&&(x[1]==2))
         x[1]=1;
        if((score[1]+d)>100)
        ob.left("Score: "+score[1],70);
        else{
        if (x[1]==2)
        d=0;
        else
        score[1]+=d;
        ob.left("Score: "+score[1],70);
        if(score[1]==100)
        {
             ob.left(player[1]+" IS THE WINNER!!!!!",70);
             ob.restart();
        }}
        m=ob.snake_ladder();
        if(m==1){
        ob.left("SWALLOWED BY SNAKE",70);
        ob.left("New Score : "+score[1],70);}
        else if(m==2){
        ob.left("CLIMBED UP THE LADDER",70);
        ob.left("New Score : "+score[1],70);}
        ob.left("---------------------------------",65);
    }
    void head()
    {
        snl2 ob=new snl2();
        System.out.println("**********************************************************************************************************************************************************************************************************");
        ob.left("//=====  ||\\    ||   --    ||  //  ||=====     &&&&     ||        --    ||==\\\\   ||==\\\\   ||===== ||==\\\\ ",35);
        ob.left("||       || \\   ||  // \\\\  || //   ||         &    &    ||       // \\\\  ||   \\\\  ||   \\\\  ||      ||  ||",35);
        ob.left("\\\\====\\\\ ||  \\  || ||===|| ||//    ||====       &&      ||      ||===|| ||   ||  ||   ||  ||====  ||==// ",35);
        ob.left("      || ||   \\ || ||   || || \\\\   ||         &&  &&    ||      ||   || ||   //  ||   //  ||      || \\\\  ",35);
        ob.left("=====//  ||    \\|| ||   || ||  \\\\  ||=====   &&&  &&&   ||_____ ||   || ||==//   ||==//   ||===== ||  \\\\ ",35);
        System.out.println("**********************************************************************************************************************************************************************************************************");
    }
    void left(String s,int l) 
    {
        System.out.printf("%-"+l+"s "+s+"%n","");
    }
    void centerify()
    {
        System.out.print("                                                                               ");;
    }
    void delay(int delay)
    {
        try {
                Thread.sleep(delay);
        }catch(InterruptedException ie) {
                ie.printStackTrace();
        }
    }
}