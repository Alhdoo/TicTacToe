/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p2009302
 */
public class ModeleGrille {
    private int ligne;
    private int colonne;
    private EtatCase grille[][];
    
    public ModeleGrille(){
        ligne=3;
        colonne=3;
        grille=new EtatCase[ligne][colonne];
        initGrille();
    }
    
    public void initGrille()
    {
        for(int i =0;i<ligne;i++)
        {
            for(int j=0;j<ligne;j++)
            {
                grille[i][j]=EtatCase.Vide;
            }
        }
    }
    
    public EtatCase getEtatCase(int i, int j)
    {
        return grille[i][j];
    }
    
    public void setEtatCase(int i, int j, EtatCase etat)
    {
        grille[i][j]=etat;
    }
    
    public int getLigne()
    {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }
    
    public boolean finPartie()
    {
        boolean testl=true;
        boolean testc=true;
        boolean testd=true;
        boolean testdi=true;
        
       for(int i=1;i<ligne;i++)
        {
            testl=true;
            for(int j=1;j<ligne;j++)
            {
                testc=true;
                if(grille[i][j]!=grille[i][j-1]||grille[i-1][j-1]==EtatCase.Vide)
                {
                    testl=false;
                }
                if(grille[i][j-1]!=grille[i-1][j-1]||grille[i-1][j-1]==EtatCase.Vide)
                {
                    testc=false;
                }
            }
        }
       for(int i =1;i<colonne;i++)
       {
           if(grille[i][i]!=grille[i-1][i-1])
           {
               testd=false;
           }
       }
       for(int i =1;i<colonne;i++)
       {
           if(grille[i+1][i+1]!=grille[i-1][i-1])
           {
               testd=false;
           }
       }
       if(testl==false&&testc==false&&testd==false)
       {
           return false;
       }
       else return true;
       
       
    }
    
    
}
