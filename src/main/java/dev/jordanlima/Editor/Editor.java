package dev.jordanlima.Editor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Editor {

    private Scanner scanner = new Scanner(System.in);
    private String pathHome = System.getProperty("user.home");
    private String separator = System.getProperty("file.separator");
    private String textUser = "";
    private String fileName = "";
    private String extensionFile = "";
    private String pathDefault = pathHome;
    private List<File> directoriesInHome = new ArrayList<>();
    private File file = null;
    private List<String> docUser = new ArrayList<>();

    public void newFile() {
        System.out.println("===================== CRIAR NOVO ARQUIVO =====================");
        System.out.println("Deseja escolher sua pasta ou deixar na pasta padrão [Documents]? ");
        System.out.println("Para escolher uma pasta digite o nome dela ou Deixe em branco para selecionar a pasta Documents");

        File home = new File(pathHome);
        File[] files = home.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    directoriesInHome.add(file);
                }
            }
        }

        String pathUser = scanner.nextLine();


        if (!directoriesInHome.contains(new File(pathDefault + separator + pathUser)) && !pathUser.isBlank()) {
            System.out.println("Diretório não encontrado...");
            System.out.println("Tente algum desses");
            for(File dirs : directoriesInHome) {
                if(!dirs.getName().startsWith(".")) {
                    System.out.println(dirs);
                }
            }

            pathUser = scanner.nextLine();

            if (!directoriesInHome.contains(new File(pathDefault + separator + pathUser))) {
                pathUser = "";
            }
        }

        if (pathUser.isBlank()) {
            pathUser = "Documents";
        }

        pathDefault += separator + pathUser;

        System.out.println("===================== JAVA EDITOR ====================");

        while(!textUser.contains("!qw")) {
            textUser = scanner.nextLine();
            if(textUser.contains("!qw")) {
                continue;
            }
            docUser.add(textUser);
        }

        System.out.println("Qual o nome do arquivo?");
        fileName = pathDefault + separator + scanner.nextLine();

        if (fileName.isBlank()) {
            fileName = pathDefault + separator + "text";
        }

        System.out.println(fileName);
        System.out.println("Qual o tipo do arquivo?");
        System.out.println("txt, doc, json, md, xml, html");
        extensionFile = "." + scanner.nextLine();
        fileName += extensionFile.toLowerCase();
        file = new File(fileName);
        if (file.exists()) {
            System.out.println("Existe um arquivo com esse nome");
            System.out.println("Y para sim e N para não");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("n")) {
                System.out.println("Escolha um novo nome...");
                fileName = pathDefault + separator + scanner.nextLine() + extensionFile.toLowerCase();
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : docUser) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Arquivo salvo: " + fileName);
        } catch (IOException e) {
              e.printStackTrace();
        }
    }
 }
