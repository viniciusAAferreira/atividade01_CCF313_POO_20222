import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class exercicio11{
    public static void main(String[] args){
        int qtdePacientes=0, qtdeHomens=0, idadeHomens=0, idade1825 = 0;
        int mulheresAlturaPeso70=0, alturaBaixa=900, idadeVelho=0;
        String nomeVelho="nome", nomeNova="Nome";
        
        try{
            FileReader leitura = new FileReader("arquivo.txt");
            BufferedReader leituraLinha = new BufferedReader(leitura);
            String quebraLinha = " ";
            
            while((quebraLinha = leituraLinha.readLine()) != null){
                String subLinha[] = quebraLinha.split(" ");
                System.out.println(subLinha[1]);
                if(subLinha[1].equals("M")){
                    qtdeHomens++;
                    idadeHomens += Integer.parseInt(subLinha[3]);
                    if(Integer.parseInt(subLinha[2])>idadeVelho){
                        nomeVelho.equals(subLinha[0]);
                    }
                }else{
                    if(Integer.parseInt(subLinha[4])>=160 && Integer.parseInt(subLinha[4])<= 170 && Integer.parseInt(subLinha[2])>=70){
                        mulheresAlturaPeso70++;
                    }
                    if(Integer.parseInt(subLinha[5])<alturaBaixa){
                        nomeNova.equals(subLinha[0]);
                    }
                }
                if(Integer.parseInt(subLinha[2])>=18 && Integer.parseInt(subLinha[2])<=25){
                    idade1825++;
                }
                qtdePacientes++;
            }
            leituraLinha.close();    
        }catch (IOException e){
            System.out.println("!!!ERRO!!!\nARQUIVO NÃO ACESSADO!");
        }
        
        System.out.printf("A quantidade de pacientes eh: %d\n", qtdePacientes);
        System.out.printf("A média de idade dos homens eh: %.2f\n", (float)idadeHomens/(float)qtdeHomens);
        System.out.printf("A quantidade de mulheres de 1,60 a 1,70 com mais de 70kg eh: %d\n", mulheresAlturaPeso70);
        System.out.printf("A quantidade de pessoas entre 18 e 25 anos eh: %d\n", idade1825);
        System.out.printf("O nome do paciente mais velho eh: %s\n", nomeVelho);
        System.out.printf("O nome da mulher mais baixa eh: %s\n", nomeNova);


    }
}
