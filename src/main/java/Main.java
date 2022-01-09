import AutoBaza.AutoBaza;
import DriverInfo.DriverInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws IOException {
            try {
                AutoBaza[] autoBaza = {new AutoBaza(), new AutoBaza(), new AutoBaza()};
                String data1 = new String(Files.readAllBytes(Path.of("C:\\Users\\Tashmatov Bektur\\IdeaProjects\\hw_1\\AutoBaza.json")));
                JSONArray json = new JSONArray(data1);
                for (int i = 0; i < 3; i++) {
                    JSONObject js = json.getJSONObject(i);
                    autoBaza[i].setId(js.getInt("id"));
                    autoBaza[i].setBus(js.getString("bus"));
                    autoBaza[i].setDriver(js.getString("driver"));
                    autoBaza[i].setStatus(js.getString("status"));
                }
                System.out.println(ANSI_PURPLE + "**************| Truck |**************" + ANSI_RESET);
                System.out.println("| # | Bus           | Driver | State |");
                System.out.println("+———+———————————————+————————+———————+");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("|%-3s", autoBaza[i].getId());
                    System.out.printf("|%-15s", autoBaza[i].getBus());
                    System.out.printf("|%-8s", autoBaza[i].getDriver());
                    System.out.printf("|%-7s", autoBaza[i].getStatus());
                    System.out.print("|");
                    System.out.println();
                }
                DriverInfo[] driverInfos = {new DriverInfo(), new DriverInfo(), new DriverInfo()};
                String data2 = new String(Files.readAllBytes(Path.of("C:\\Users\\Tashmatov Bektur\\IdeaProjects\\hw_1\\DriverInfo.json")));
                JSONArray json1 = new JSONArray(data2);
                for (int i = 0; i < 3; i++) {
                    JSONObject js1 = json1.getJSONObject(i);
                    driverInfos[i].setId(js1.getInt("id"));
                    driverInfos[i].setIdDriver(js1.getString("idDriver"));
                    driverInfos[i].setDriver(js1.getString("driver"));
                    driverInfos[i].setBus("");
                }
                while(true) {
                    Scanner console = new Scanner(System.in);
                    System.out.print(ANSI_GREEN + "Choose one of the Truck: " + ANSI_RESET);
                    int a = console.nextInt();
                    if (a == 1) {
                        System.out.println(ANSI_PURPLE + "********| Truck Info |********" + ANSI_RESET);
                        System.out.println("N          : " + a + "\nBus        : " + autoBaza[0].getBus() + "\nDriver     : " + "\nBus State  : " + autoBaza[0].getStatus());
                    } else if (a == 2) {
                        System.out.println(ANSI_PURPLE + "********| Truck Info |********" + ANSI_RESET);
                        System.out.println("N          : " + a + "\nBus        : " + autoBaza[1].getBus() + "\nDriver     : " + "\nBus State  : " + autoBaza[1].getStatus());
                    } else if (a == 3) {
                        System.out.println(ANSI_PURPLE + "********| Truck Info |********" + ANSI_RESET);
                        System.out.println("N          : " + a + "\nBus        : " + autoBaza[2].getBus() + "\nDriver     : " + "\nBus State  : " + autoBaza[2].getStatus());
                    }else{
                        System.out.println(ANSI_RED + "   !!!Всего 3 грузовика!!!   " + ANSI_RESET);
                        continue;
                    }
                    System.out.println(ANSI_YELLOW + """
                            Press 1 to change Driver
                            Press 2 to send to the Route
                            Press 3 to send to the Repairing""" + ANSI_RESET);
                    int q = console.nextInt();

                    switch (q) {
                        case 1:
                            System.out.println(ANSI_RESET + """
                                    ---------------------------
                                    Driver changed successfully
                                    ---------------------------""" + ANSI_RESET);
                            System.out.println(ANSI_PURPLE + "----------Drivers----------" + ANSI_RESET);
                            System.out.println("| # | id   | Driver   | Bus    |");
                            System.out.println("+———+——————+——————————+————————+");
                            for (int i = 0; i < 3; i++) {
                                System.out.printf("|%-3s", driverInfos[i].getId());
                                System.out.printf("|%-6s", driverInfos[i].getIdDriver());
                                System.out.printf("|%-10s", driverInfos[i].getDriver());
                                System.out.printf("|%-8s", driverInfos[q].getBus());
                                System.out.print("|");
                                System.out.println();
                            }
                            System.out.println(ANSI_PURPLE + "**************| Truck |**************" + ANSI_RESET);
                            System.out.println("| # | Bus           | Driver | State |");
                            System.out.println("+———+———————————————+————————+———————+");
                            for (int i = 0; i < 3; i++) {
                                System.out.printf("|%-3s", autoBaza[i].getId());
                                System.out.printf("|%-15s", autoBaza[i].getBus());
                                System.out.printf("|%-8s", autoBaza[i].getDriver());
                                System.out.printf("|%-7s", autoBaza[i].getStatus());
                                System.out.print("|");
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println(ANSI_RED + "-----Route надо доработать-----" + ANSI_RED);
                            break;
                        case 3:
                            System.out.println(ANSI_RED + "-----Repairing нада доработать-----" + ANSI_RESET);
                            break;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("\n");
    }
}