package com.quizapplication;

public class Game {
Question[] questions=new Question[3];
Player player=new Player();
     String[] questionsdata={"Who is strongest avenger","Which is national bird","Which is the king of fruit"};
     String[] options1={"Iron man","sparrow","Mango"};
    String[] options2={"Thor","pigeon","Apple"};
    String[] options3={"Hulk","peacock","banana"};
    String[] options4={"Ant man","eagle","orange"};
    int[] ans={2,3,1};

    public void  initGame(){

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAns=ans[i];
        }


    }

    public void play() {
        player.getDetails();
        for (int i = 0; i < 3; i++) {
            boolean status = questions[i].askQuestion();
            if (status == true) {
                System.out.println("Played successfully!!!");
                player.score += 10;
            } else {
                System.out.println("Better luck next time");
                player.score -= 10;
            }
        }
        System.out.println(player.name+ " you have scored"  +player.score);
    }

}
