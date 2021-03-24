/*
 * 
  Assignment Number: 
  Assignment Name: 
  Author: 
  Due: 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Random;
import java.util.Scanner;


public class TicTacToe {
    


    public static void main(String[] args) {
        
        char gameBoard[][] =
        {{' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '}
        };
        
        BuildBoard(gameBoard);
        
        ChoosePosition(gameBoard);
            
    }//main
        
    public static void BuildBoard(char[][] gameBoard)
    {
        for(char[] row : gameBoard)
        {
            for(char col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }//BuildBoard
    
    public static void ChoosePosition(char[][] gameBoard)
    {
        boolean cont = true;
        
        while(cont == true)
        {
            int p;
            boolean cont2 = true;
                    
            while(cont2 == true)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Choose position (1-9): ");
                p = sc.nextInt();
                cont2 = AddMark(gameBoard, p, "player");
                if(cont2 == false)
                {
                    BuildBoard(gameBoard);
                }
            }

            cont = Winner(gameBoard);
            
            if(cont == false)
            {
                break;
            }

            cont2 = true;
            
            while(cont2 == true)
            {
                Random randNum = new Random();
                p = randNum.nextInt(9) + 1;

                System.out.println("Computers turn: ");
                cont2 = AddMark(gameBoard, p, "computer");
                if(cont2 == false)
                {
                    BuildBoard(gameBoard);
                }
                
            }


            cont = Winner(gameBoard);  
            
        }
    }
       
    public static boolean AddMark(char[][] gameBoard, int p, String input)
    {
        char sym = ' ';
        if(input.equals("player"))
            {
                sym = 'X';
            }
        else if(input.equals("computer"))
            {
                sym = 'O';
            }
           
        boolean cont2 = true;
        
        switch(p){
            case 1:
                if(gameBoard[0][0] == ' ')
                {
                    gameBoard[0][0] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 2:
                if(gameBoard[0][2] == ' ')
                {
                    gameBoard[0][2] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 3:
                if(gameBoard[0][4] == ' ')
                {
                    gameBoard[0][4] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 4:
                if(gameBoard[2][0] == ' ')
                {
                    gameBoard[2][0] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 5:
                if(gameBoard[2][2] == ' ')
                {
                    gameBoard[2][2] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 6:
                if(gameBoard[2][4] == ' ')
                {
                    gameBoard[2][4] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 7:
                if(gameBoard[4][0] == ' ')
                {
                    gameBoard[4][0] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 8:
                if(gameBoard[4][2] == ' ')
                {
                    gameBoard[4][2] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            case 9:
                if(gameBoard[4][4] == ' ')
                {
                    gameBoard[4][4] = sym;
                    cont2 = false;
                    return cont2;
                }else{
                    System.out.println("Cannot place mark there");
                    break;
                }
            default:
                break;
              
        }
        return cont2;
    }//AddMark
    
    public static boolean Winner(char[][] gameBoard)
    {
        boolean cont;
        for(int i=0; i < 5; i=i+2)
        {
            if(gameBoard[i][0] == gameBoard[i][2] && gameBoard[i][2] == gameBoard[i][4] && gameBoard[i][0] != ' ')//Row Check
            {
                System.out.println("Game Over, row win");
                cont = false;
                return cont;
                
                
            }else if(gameBoard[0][i] == gameBoard[2][i] && gameBoard[2][i] == gameBoard[4][i] && gameBoard[0][i] != ' ') //Column Check
                {
                    System.out.println("Game Over, column win");
                    cont = false;
                    return cont;

                }
        }
        
        if(gameBoard[0][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][4] && gameBoard[0][0] != ' ') //Diagonal Check
            {
                System.out.println("Game Over, diagonal win");
                cont = false;
                return cont;

            }else if(gameBoard[0][4] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][0] && gameBoard[0][4] != ' ')
            {
                System.out.println("Game Over, diagonal win");
                cont = false;
                return cont;

            }else{ 
                    cont = true;
                    return cont;
                 }   
    }//Winner
}//Class
