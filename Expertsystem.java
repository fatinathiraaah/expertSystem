/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertsystem;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Expertsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        /*String[] majarr=new String[3];
        String[] IntAI=new String[3];
        String[] SkAI=new String[8];
        String[] TSAI=new String[24];
        String[] CareerAI=new String[24];*/    
             
        System.out.println("\t\t\tWELCOME TO CAREER PATH EXPERT SYSTEM!\n");
        System.out.println("Please choose your major:(please insert number e.g 1)\n1.Artificial Intelligence\n2.Information Systems\n3.Computer "
                + "System and Networking\n4.Software Engineering");
        int major=s.nextInt();
       
        if (major==1){//artificial intelligence
            System.out.println("Next, please choose a number that show your interest:\n1. Research and Development\n2. Automation\n3. Gameplay");
            int IntAi=s.nextInt();
            if(IntAi==1){//research and dev
                System.out.println("\nPlease choose one of these skills that you have:\n1.Analytical\n2.Tecnophile(love to know new tech\n3.Multitasking");
                int SkAi=s.nextInt();
                if(SkAi==1){//analytical
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.MATLAB\n2.arduino\n3.java");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//matlab
                        System.out.println("Career Recommendation: Bioinformatics technician");
                    else if(TSAi==2)//arduino
                        System.out.println("Career Recommendation: Academician in robotic");
                    else//java
                        System.out.println("Career Recommendation: Bioinformatics specialist");
                                    }
                else if(SkAi==2){//technophile
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.big data\n2.data visualization\n3.machine learning");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//big data
                        System.out.println("Career Recommendation: Data Analyst");
                    else if(TSAi==2)//data visualization
                        System.out.println("Career Recommendation: Academician");
                    else//machine learning
                        System.out.println("Career Recommendation: Researcher in Computer sc");
                                }
                else if(SkAi==3){//multitasking
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.Oracle\n2.clips\n3.python");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//oracle
                        System.out.println("Career Recommendation: Domain Engineer");
                    else if(TSAi==2)//clips
                        System.out.println("Career Recommendation: Knowledge Engineer");
                    else//python
                        System.out.println("Career Recommendation: Control Engineer");
                }              
            }
            else if(IntAi==2){//automation
                System.out.println("Please choose one of these skills that you have:\n1.Mathematics\n2.Building\n3.Designing");
                int SkAi=s.nextInt();
                if(SkAi==1){//mathematics
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.robot operating system\n2.raspberry pi\n3.java");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//ros
                        System.out.println("Career Recommendation: Robotic System Engineer");
                    else if(TSAi==2)//rspberry
                        System.out.println("Career Recommendation: Maintenance Engineer");
                    else//java
                        System.out.println("Career Recommendation: Programmer");
                                    }
                else if(SkAi==2){//building
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.roboze\n2.python\n3.3D printing");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//roboze
                        System.out.println("Career Recommendation: Robotic System Engineer");
                    else if(TSAi==2)//python
                        System.out.println("Career Recommendation: Robotic Scientist");
                    else//3d prit
                        System.out.println("Career Recommendation: 3D Printing Specialist");
                                }
                else if(SkAi==3){//designing
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.Solidworks\n2.Blender\n3.Autocad");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//solidw
                        System.out.println("Career Recommendation: Robot Integrator");
                    else if(TSAi==2)//blender
                        System.out.println("Career Recommendation: Automated Product Design Engineer");
                    else//autocad
                        System.out.println("Career Recommendation: Robotic System Engineer");
                }              
            }
            else if(IntAi==3){//gameplay
                System.out.println("Please choose one of these skills that you have:\n1.creative\n2.problem solving\n3.Designing");
                int SkAi=s.nextInt();
                if(SkAi==1){//creative
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.Blender\n2.Maya\n3.K-3D");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//blender
                        System.out.println("Career Recommendation: Motion Capture Artist");
                    else if(TSAi==2)//maya
                        System.out.println("Career Recommendation: Game Animator");
                    else//K-3D
                        System.out.println("Career Recommendation: 3D-artist");
                                    }
                else if(SkAi==2){//problem solv
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.Quality Assurance Software\n2.Processor:AMD,Intel\n3.Apache JMeter");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//Quality ass
                        System.out.println("Career Recommendation: Quality Assurance Tester");
                    else if(TSAi==2)//processor
                        System.out.println("Career Recommendation: Game Analytics");
                    else//apace
                        System.out.println("Career Recommendation: Game Tester");
                                }
                else if(SkAi==3){//designing
                    System.out.println("Please choose Technology Tools that you are familiar with:\n1.GUI\n2.Photoshop\n3.Unreal Engine 4");
                    int TSAi=s.nextInt();
                    if(TSAi==1)//gui
                        System.out.println("Career Recommendation: Game Developer");
                    else if(TSAi==2)//photoshop
                        System.out.println("Career Recommendation: Game Designer");
                    else//unreal
                        System.out.println("Career Recommendation: Game Designer");
                }              
            }
            
        }
        
    }
    
}
