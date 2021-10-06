Gson gson = new Gson();

JsonReader reader = new JsonReader(new FileReader("./app/src/main/resources/recentquotes.json"));

List<qout> data = gson.fromJson(reader, REVIEW_TYPE);

System.out.println(data.size());

int range = (137 - 0) + 1;

int x=(int)(Math.random() * range) + 0;

System.out.println(data.get(x));

System.out.println("-----------------------------------------------------------------------------");
}

## you can just run this code and get a random quote out of the json file

# day 2 

you jsut need to rpovide an api and the application will read from the api if the conection is succsisfull and 

and then add the quote to the json file and if the connection faild it will show a random qoute from the json file