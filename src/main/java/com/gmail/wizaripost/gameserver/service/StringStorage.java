package com.gmail.wizaripost.gameserver.service;

public class StringStorage {

    public String getGameInit() {
        return gameInit;
    }

    public String getGameSession() {
        return gameSession;
    }




    String gameInit = "{\n" +
            "  \"p\": \"GameStart\",\n" +
            "  \"rsp\": {\n" +
            "    \"GameMatrix\": [\n" +
            "      [\n" +
            "        0,\n" +
            "        0,\n" +
            "        0,\n" +
            "        0,\n" +
            "        0\n" +
            "      ],\n" +
            "      [\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1\n" +
            "      ],\n" +
            "      [\n" +
            "        2,\n" +
            "        2,\n" +
            "        2,\n" +
            "        2,\n" +
            "        2\n" +
            "      ],\n" +
            "      [\n" +
            "        3,\n" +
            "        3,\n" +
            "        3,\n" +
            "        3,\n" +
            "        3\n" +
            "      ],\n" +
            "      [\n" +
            "        4,\n" +
            "        4,\n" +
            "        4,\n" +
            "        4,\n" +
            "        4\n" +
            "      ]\n" +
            "    ],\n" +
            "    \"SelectedBetPerLine\": 1,\n" +
            "    \"SelectedLinesAmount\": 50,\n" +
            "    \"Symbols\": [\n" +
            "      {\n" +
            "        \"SymbolId\": 0,\n" +
            "        \"SymbolName\": \"SEVEN\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 1,\n" +
            "        \"SymbolName\": \"BELL\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 2,\n" +
            "        \"SymbolName\": \"WATERMELON\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 3,\n" +
            "        \"SymbolName\": \"GRAPES\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 4,\n" +
            "        \"SymbolName\": \"PLUM\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 5,\n" +
            "        \"SymbolName\": \"LEMON\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 6,\n" +
            "        \"SymbolName\": \"ORANGE\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 7,\n" +
            "        \"SymbolName\": \"CHERRY\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"SymbolId\": 8,\n" +
            "        \"SymbolName\": \"WILD\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"WinDescriptors\": [\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 0,\n" +
            "        \"SymbolName\": \"SEVEN\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 1000\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 1,\n" +
            "        \"SymbolName\": \"SEVEN\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 250\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 2,\n" +
            "        \"SymbolName\": \"SEVEN\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 50\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 3,\n" +
            "        \"SymbolName\": \"BELL\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 600\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 4,\n" +
            "        \"SymbolName\": \"BELL\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 100\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 5,\n" +
            "        \"SymbolName\": \"BELL\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 25\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 6,\n" +
            "        \"SymbolName\": \"WATERMELON\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 200\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 7,\n" +
            "        \"SymbolName\": \"WATERMELON\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 50\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 8,\n" +
            "        \"SymbolName\": \"WATERMELON\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 10\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 9,\n" +
            "        \"SymbolName\": \"GRAPES\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 200\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 10,\n" +
            "        \"SymbolName\": \"GRAPES\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 50\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 11,\n" +
            "        \"SymbolName\": \"GRAPES\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 10\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 12,\n" +
            "        \"SymbolName\": \"PLUM\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 100\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 13,\n" +
            "        \"SymbolName\": \"PLUM\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 25\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 14,\n" +
            "        \"SymbolName\": \"PLUM\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 5\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 15,\n" +
            "        \"SymbolName\": \"LEMON\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 100\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 16,\n" +
            "        \"SymbolName\": \"LEMON\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 25\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 17,\n" +
            "        \"SymbolName\": \"LEMON\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 5\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 18,\n" +
            "        \"SymbolName\": \"ORANGE\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 100\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 19,\n" +
            "        \"SymbolName\": \"ORANGE\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 25\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 20,\n" +
            "        \"SymbolName\": \"ORANGE\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 5\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 21,\n" +
            "        \"SymbolName\": \"CHERRY\",\n" +
            "        \"SymbolAmount\": 5,\n" +
            "        \"Score\": 100\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 22,\n" +
            "        \"SymbolName\": \"CHERRY\",\n" +
            "        \"SymbolAmount\": 4,\n" +
            "        \"Score\": 25\n" +
            "      },\n" +
            "      {\n" +
            "        \"WinDescriptorId\": 23,\n" +
            "        \"SymbolName\": \"CHERRY\",\n" +
            "        \"SymbolAmount\": 3,\n" +
            "        \"Score\": 5\n" +
            "      }\n" +
            "    ],\n" +
            "    \"BetPerLine\": [\n" +
            "      1,\n" +
            "      2,\n" +
            "      3,\n" +
            "      4,\n" +
            "      5,\n" +
            "      10,\n" +
            "      20,\n" +
            "      40\n" +
            "    ],\n" +
            "    \"GamblerMaxHistorySize\": 5,\n" +
            "    \"GamblerMultiplier\": 2,\n" +
            "    \"GamblerPlayLimit\": 5,\n" +
            "    \"GamblerWinLimit\": 1000000,\n" +
            "    \"Lines\": [\n" +
            "      50\n" +
            "    ],\n" +
            "    \"MaxBet\": 40,\n" +
            "    \"MaxWin\": 1000000,\n" +
            "    \"ActiveLanguage\": \"EN\",\n" +
            "    \"Languages\": [\n" +
            "      \"CS\",\n" +
            "      \"EN\"\n" +
            "    ],\n" +
            "    \"CurrencyCode\": \"FUN\",\n" +
            "    \"Yield\": 94,\n" +
            "    \"p\": \"GameStart\"\n" +
            "  },\n" +
            "  \"c\": {\n" +
            "    \"c1\": 50000000.00,\n" +
            "    \"c2\": 0.0,\n" +
            "    \"c3\": 0.0\n" +
            "  },\n" +
            "  \"gp\": \"0\",\n" +
            "  \"v\": \"1.0.0.0\"\n" +
            "}";

    String gameSession = "{\"Status\": true,\"InitialParameters\": " +
            "{\"FileServerAddress\": \"http://localhost:8080/FileLoad.aspx\"," +
            "\"GameServerAddress\": \"http://localhost:8080/GameProxy.aspx\"," +
            "\"GameInstanceID\": \"6632b30e-f692-4097-be56-dd5100fb90ae-74131\"," +
            "\"GameID\": 250," +
            "\"GameUGN\": \"N/A\"," +
            "\"GameMode\": \"demoplay\"," +
            "\"LoaderVersion\": \"3.17.3\"," +
            "\"LoaderContextVersion\": \";3.17.3\"," +
            "\"LanguageCode\": \"EN\"," +
            "\"CurrencyCode\": \"FUN\"," +
            "\"AspectRatio\": \"\"," +
            "\"IsHistoryMode\": false," +
            "\"HistoryNo\": 1," +
            "\"MinimalPeriodBetweenBetsInSeconds\": 0," +
            "\"AccountServicesAddress\": \"\"," +
            "\"GameSessionID\": 74131," +
            "\"GameSessionSecureToken\": \"6632b30e-f692-4097-be56-dd5100fb90ae\"}}";

}
