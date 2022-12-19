import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
// ������ ����������� � ������� ���


public class Alias { // ������� �����
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>(Arrays.asList(  // ������ ���
                // ��������
                "�������", "���������", "���������", "������� - ����i", "Himars", "����������",
                "��������", "��� - ������", "�����", "�������", "������", "���������", "������ ����",
                "�i�", "������������", "ó��",
                // ���
                "����", "����", "��������", "��������", "��������", "����", "����", "����", "����",
                "����", "�����", "���", "��������", "������", "�����", "������", "ѳ��", "��������",
                "�'���", "������", "����", "������", "������", "ϳ��", "��� - ���", "����",
                "�������", "�����", "��������", "���", "������", "������", "����", "˳���", "�����",
                // ������
                "����", "��������", "������", "���", "������", "�����",
                // ������
                "������", "���", "�������", "����", "�����������", "ϳ����������", "�����",
                "�������",
                // ̳���
                "���i�����", "I��i��", "����", "����", "����������", "��������",  "������",
                "�����", "���", "�������", "������", "��������",
                // ����
                "����� - ������", "�����i���i�", "����������i��", "���", "��� �� 3 ��i",
                "�������i���", "�i����������i�", "����", "��������", "����� ������� ��������",
                "������� ������, �� � ������", "����� ���", "ҳ���� - ������",
                "������ �����", "������� �������",
                // ����
                "�i�", "������", "Starlink", "������", "�������", "��������",
                "������", "˳����", "������", "�����", "³���", "���", "�����", "������", "�������",
                "ͳ����", "������", "������", "�������", "�����", "���������", "����������",
                "�����", "�������", "������", "����", "�������", "����", "ʳ���", "�����",
                "��������", "�������", "����", "����", "������", "����", "ϳ����", "�������",
                "�������", "������", "����", "���", "�����", "�����", "̳����", "г�", "������",
                "���������", "���", "����", "�������", "������", "³���������", "�������", "˳�����",
                "�����", "�����", "���������", "����", "���������", "�����",
                "�����", "������", "����������", "̳���", "��������", "�����������", "̳�������",
                "������", "�'������", "����", "������", "��������", "�����", "������", "����",
                "Գ����", "������", "���", "�������", "�����", "������", "��������", "������",
                "������������", "������", "����", "����", "ѳ��", "�����", "�����", "����",
                "�����", "ʳ��", "�����", "³���", "�����", "�����", "�����", "������", "�����������",
                "�����", "������", "������", "�������", "�������", "������", "���", "�������",
                "������", "�������", "�������", "����", "�����", "������", "���", "���������",
                "�������", "������", "����'�", "���������", "�����", "�����", "ͳ�", "������",
                "����", "̳���", "�������", "�������", "��������", "�������", "�����", "���������",
                "�������", "��������", "���", "������", "ҳ���", "�������", "ó��",
                "���������", "�����", "ó����", "������", "������", "�������", "�����",
                "������", "����������", "ó�������", "������", "�����������", "�������", "�����",
                "������", "�����", "�����", "���������", "³��", "������", "�������", "�����",
                "����", "����", "�����", "ٳ���", "��������", "�������", "������",
                "��������", "�������������", "������", "�����", "������", "����", "�����",
                "�������", "����", "�������", "����", "������", "ǳ���", "��������", "�����",
                "���������", "������", "�������", "�������", "�����", "������", "������", "��������",
                "˳�������", "������", "������", "�������", "�����", "������", "����", "������",
                "�������", "�����", "��������", "������", "˳���", "������", "г���",
                "ϳ����", "��", "���", "��������", "������", "˳���", "�����", "����",
                "������������", "����", "������", "���", "�������", "���������", "�������", "����",
                "���������", "����", "������", "�����", "���������", "���������", "�����", "г�",
                "�����", "ѳ����", "�������", "�����", "��������", "����������", "���������",
                "�������", "��������", "��������", "���������", "�������", "˳�����", "��������",
                "���������", "��������", "�����", "��������", "���������", "������", "��������",
                "�����", "�����", "³�������", "������������", "�������", "����", "������", "���������",
                "��������", "��������", "��������", "������", "�����", "�������",
                "��������", "�����", "���������", "�����", "�������", "׳�����", "������", "ϳ����",
                "����", "�����", "����������", "�����", "������", "�����", "������",
                "��������", "����������", "������", "���������", "���������", "�������",
                "�����", "�������", "��������", "������", "����", "�������", "������", "������",
                "�����", "������", "���", "������", "�������", "���", "�������", "������",
                "�������", "����", "�������", "����", "�����", "���'��������", "���������",
                "���������", "������������", "������", "������", "��������", "����", "�������",
                "�������", "����", "�����", "��������", "���������", "�����", "�������", "����",
                "�������", "�����������", "����������", "����", "�����", "������", "ĳ���", "ϳ��",
                "�����", "�����", "����", "�����", "�����", "���������", "��������",
                "�������", "˳��", "³�����", "���", "�����", "������", "����", "���������",
                "������", "�����", "���", "����", "�����", "����", "����", "�����", "������", "���������",
                "�������", "��������", "������", "�����", "������", "����������", "�����������",
                "������ ����", "�����", "�����", "���������", "ĳ���������", "��������", "��������������",
                "������", "���", "�����", "�����", "���������", "��'����", "�������", "��������",
                "����", "�����", "����", "���", "³������", "����������",
                "ֳ��", "̳����", "����", "����", "�����", "������", "����", "�����", "��������",
                "����", "������������", "���������", "��������", "���������", "�����������", "���������",
                "�����������", "����������", "���������", "�����", "����", "����", "���", "�����",
                "�������������", "���������", "����������", "����", "������", "�������", "������",
                "����", "������", "������", "���", "������", "³���", "��������",
                "�������", "̳�", "���������", "������������", "���", "���������", "����������",
                "�����", "������", "�����", "��������", "ѳ���", "������", "��������", "��������",
                "�����", "Ƴ���", "³������", "����", "ϳ�������", "����", "�����",
                "���������", "������", "��������", "�����������", "������", "̳������", "�����",
                "�����", "�����", "������", "������", "�����", "���", "������", "������", "�������",
                "��������", "�����", "�����������", "��������", "�����", "����", "�����",
                "�����", "������", "�����", "�����", "�����", "������", "��������",
                "�������", "�������", "��������", "�����", "�����", "�����", "�������", "����������",
                "����", "�������", "�������", "����� ���������", "�����", "³��������", "���������",
                "�������", "���������", "ĳ���", "�������", "�����", "���", "�������", "�����",
                "������", "³�����", "����", "����������������", "���������", "����������",
                "��������", "�����������", "�������", "������", "���������", "������������",
                "�������", "�����", "�����������", "������", "������", "������", "����������",
                "������", "��������", "��������", "����", "����", "�����", "����", "������",
                "�����", "���", "�����", "����", "������� ������", "��������", "��������",
                "���", "���������", "���", "�����", "��������", "������", "������", "�����", "�����",
                "�������", "�����", "������", "������", "����������", "��������", "�����", "����",
                "̳��", "˳����", "������", "������", "������", "����", "����", "����",
                "������", "����", "�����", "�����", "�������", "��������", "³�", "ʳ�", "�����",
                "ϳ�����", "г�", "������", "������", "�������", "�������", "�������", "����������",
                "��������", "���������", "�����", "��������", "�����", "����������", "����", "���������",
                "ϳ������������", "������������", "³��������", "���������", "��������", "��������",
                "������", "����", "�������", "�������", "�����", "��������", "����", "�������",
                "����", "�����", "�������", "��������", "����������", "����", "�����", "ó������",
                "����������", "����", "����������", "�����", "������", "������", "�������",
                "����������������", "�����������", "������", "�������", "���", "����", "������",
                "����������", "��������", "������", "��� �� �����", "������", "������",
                "������", "�������", "�����", "�������", "������", "������", "������", "�����",
                "��������", "����������", "�����", "�����", "�����", "�������", "������", "�����",
                "������", "���", "ʳ����", "³����", "�����", "������", "�������", "�������",
                "�����", "�������", "������", "������� ����", "�����������", "���������", "г����",
                "�����������", "��������", "����", "�������", "��������", "��������", "������",
                "������", "�������", "��������", "�����", "������", "����������", "��������",
                "�����", "�����", "�����", "����", "���", "�����", "������", "��������", "���",
                "�������", "�������", "ǳ����", "�����", "���������", "˳�����", "����", "������",
                "ϳ����", "��������", "ϳ�����", "�������", "����", "��������", "�������", "�������",
                "���", "�������", "������", "���������", "��������", "�����", "������",
                "�����", "�����", "������", "����", "����", "����", "�����", "������", "��������",
                "³�����", "��������", "��������", "����������", "�����", "������",
                "������", "�������", "�����", "�����", "��������", "������", "��������", "�����",
                "������", "�����", "��������������", "���������", "˳����", "���������", "��������",
                "ĳ�����", "��������", "�������", "�����", "�����", "����", "��������", "���������",
                "����", "����", "�ʳ��", "����", "���������", "�������", "��������", "�����", "����",
                "�����", "�������", "�������", "��������", "�����", "���", "�����", "����",
                "����", "�����", "˳�����", "�����", "³���", "������", "�������", "�����",
                "�����", "������", "�������", "�������", "����", "��������", "�����", "������",
                "�����", "������", "������", "������", "³���", "������", "����", "��������",
                "�����", "����", "�����", "�����", "�����", "�����", "��������", "�����", "˳���",
                "����", "������", "���������", "���", "�����", "�����", "��������", "³������",
                "����", "����", "��������", "������", "�����", "����", "���", "˳���", "˳���",
                "�������", "�������", "������", "�����", "������", "����������", "������", "��������",
                "���������", "��������", "�����", "����", "�������", "������", "������", "����",
                "����", "����������", "���", "�����", "�������", "����", "�����������",
                "���", "��������", "�������", "������", "�����", "������", "������", "�������",
                "������", "�����", "�����", "����", "������", "�����", "�����", "��������",
                "�����", "��������", "������", "�����", "���������", "��������", "���", "�����",
                "������", "�������", "�������", "���������", "�����", "������", "ó���",
                "����", "����", "�����", "�����", "�������", "����", "�����", "ó�������", "����",
                "������", "�������", "������", "��������", "�����", "�����", "���", "�����",
                "������", "���������", "���", "���������", "����������", "������", "������",
                "���������", "����", "�����", "�����", "��������", "���", "������", "������", "������",
                "��������", "��������", "�������", "���", "�������", "ϳ���", "������", "�������",
                "�����", "�����", "�����", "������'�", "������", "������", "�������",
                "�����", "�����", "��������", "������", "ʳ����", "³�����", "�����", "����", "����",
                "��������", "�����������", "�������������", "�����", "����������", "ĳ�", "������������",
                "�������", "����������", "�������", "�������", "�������������", "�������", "�������",
                "���������", "�������", "���������", "�����������", "ϳ����������", "����",
                "���������", "�����������", "���������", "��������", "�����", "�����������",
                "˳���������", "������", "������", "�������", "�������", "�������", "������",
                "��������", "������", "���������", "�������", "����", "��������", "�����", "ϳ������",
                "ϳ����", "�������", "��������", "�������", "³����", "�����", "�������", "����������",
                "���������", "���������", "������", "������", "������", "�����������",
                "�������", "����", "�����", "�����", "������", "������", "����", "���������",
                "����", "�����", "�������", "������", "��������", "�����", "����������", "��������",
                "�������", "��������", "�����", "�������", "�������", "����������", "������",
                "���������", "��������", "˳��������", "�������", "��������", "������", "��������",
                "������", "��������", "�������", "³���������", "����������", "�����", "�����",
                "����������", "³���", "�����������", "�����������", "����������", "������", "������",
                "�������", "����������", "������", "������������", "���������", "ǳ���", "��������",
                "��������", "³�����", "Գ����", "ϳ���", "ϳ���", "�������", "���", "�������",
                "�����������", "ϳ���������", "�������", "���������", "������", "�����", "��������",
                "��������", "������", "�����", "��������", "�������", "�������������", "���",
                "�������", "�����", "���������", "������", "�����", "������", "��ﳺ���", "�����",
                "�����", "������������", "������", "��������", "����", "��������", "�����", "���������",
                "�����", "�������", "������", "���������", "����������", "�����������", "�������",
                "��������", "������", "�������", "��������", "��������", "����", "�������",
                "������", "�����", "�����������������", "������", "�������", "���������", "�������",
                "�����������", "������", "�����", "��������", "��������", "������", "������", "ѳ���",
                "���������", "�������", "������", "���", "��������", "��������", "ʳ����", "�������",
                "�������", "�����", "��������", "�����", "�����", "���������", "�������", "�������",
                "������", "������", "������", "������", "�������", "������", "�������", "������",
                "��������", "�������", "�����", "�����������", "�������������", "��������",
                "����������", "���������", "�������", "���������", "��������", "�������������",
                "�������", "�������", "������������", "�����", "ϳ�����", "�����������", "����",
                "��������", "��������", "������", "������", "�������", "����������", "����������",
                "����������", "������", "����", "����������", "ϳ�����", "��������", "������",
                "���������", "����������", "������", "���������", "������������", "��������",
                "���������", "����", "�����������", "������", "��������", "����", "ó����",
                "������������", "�������", "�������", "������'�", "ó��������", "������", "ϳ������",
                "��������", "�������", "�������", "�������", "������������", "������", "��������",
                "������", "����", "�������", "�������", "�����", "��������", "������������",
                "���", "������", "�����", "������", "�������", "�����", "��������", "��������",
                "�������", "��������", "������", "��������", "���", "���������", "������", "������",
                "��������", "��������", "������", "ϳ������", "³��������", "������",
                "�����", "����������", "���������", "�������", "�������", "�����", "����", "�������",
                "��������", "�����", "������", "�������", "�����", "������", "������������",
                "�������", "ó�", "̳���", "�������������", "̳���", "���", "���������", "��������",
                "�������", "�����", "������", "�����", "�����", "������", "��������", "���������",
                "����", "�������", "���������������", "��������", "������", "�������", "�������",
                "���", "��������� ������", "������", "�����", "����'���", "���������", "�������",
                "�������", "����", "����������", "����������", "ĳ������", "�����", "�����'��",
                "����������", "����", "������", "���䳺��", "����", "�������", "����", "���������",
                "�����", "³������", "���������", "������", "��������", "�����������", "�������",
                "����", "����", "�������", "�������", "�������", "³�����", "³�������", "��������",
                "��������", "�����������", "ϳ�������", "������", "ճ��", "Գ����", "�����",
                "ϳ�����", "����", "³���", "������", "��������", "����", "����������", "������",
                "�����", "����", "���", "�����", "����������", "�����", "�����", "������",
                "��������", "ϳ����", "�����", "����������", "����������", "������������", "�������",
                "г�����", "������", "��������", "������", "���������", "����������", "��������",
                "������", "�����", "��������", "������", "���������", "������������", "�����������",
                "��������", "������� ��������", "�����", "���� �����", "�����", "����", "�����",
                "�����", "���������", "�������", "������", "��������", "�����", "��������",
                "���������", "��������", "��������", "��������", "�������", "ϳ�", "���'����",
                "���������", "��������", "������", "����", "��������", "�������", "��������",
                "�����", "³�������", "����", "�����", "����", "��������", "��������", "Ƴ��������",
                "����������", "������", "�������", "�����", "���������", "��������", "�����",
                "�����", "Գ���", "�������", "��������", "˳���", "��������", "�������", "������",
                "������", "������", "��������", "�����", "���������", "�������", "Գ��", "����������",
                // ³���
                 "���",   "���", "���������", "�����������", "��������� �i��", "��������",
                "�������� �������", "�������", "���������",  "���� ��� �����", "����������",
                "��������", "������ �����", "�������", "����", "̳��", "���������", "������",
                "���������", "�����", "����", "������������", "���� - ��", "����������", "�������",
                "���������"
        ));

        String[] command_name = {"���", "�������"};
        int[] command_score = {0, 0};

        System.out.println("�i���� � ��i Alias. ����i��� ������� 5 ��i�."); // ³�����
        boolean game_status = true;

        while(game_status) { 
            
            Random rand = new Random(); 
            int index = rand.nextInt(words.size()); // ��������� ��������� ��� ���
            try {
               
                for(int i = 0; i < command_name.length; i++) {
                    try {
                        System.out.println("\n��� " + "\'" + command_name[i] + "\'.");
                        System.out.println("C����: " + words.remove(index) + ".");
                        Scanner scan = new Scanner(System.in);  // ��������� ����������
                        System.out.println("�������?(1 - ���, 0 - �i): ");
                        int answear = scan.nextInt();  // ������� �������
                        
                        if (answear == 1) { // ���� ����
                            command_score[i]++;
                            System.out.println("�������. � " + "\'" + command_name[i] + "\' " + command_score[i] + " ���i�.");
                        } else if (answear == 0) {  // ���� �� ����
                            System.out.println("�� �������. ������� " + "\'" + command_name[i] + "\'" + " ������� " + command_score[i] + " ���i�.");
                        } else {
                            System.out.println("����i�� 0 ��� 1! �i���i��� ���i�: " + command_score[i] + ".\n");
                        }
                        if(command_score[i] == 5) { // ���� ������� 5 ����
                            System.out.println("\n�������" + "\'" + command_name[i] + "\' ���������.");
                            game_status = false;
                            break;
                        } else if(words.size() == 0) { // ���� ���������� �����
                            System.out.println("���i������� �����.");
                            break;
                        } 
        
                    } catch(Exception e) {
                        System.out.println("����i�� 0 ��� 1! �i���i��� ���i�: " + command_score[i] + ".\n");
                    }
                    }

            } catch (Exception e) {
                System.out.println("����� ���i�������");
                break;
            }
        }
    }
}