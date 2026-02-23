import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        backgroundColor: const Color.fromARGB(246, 11, 160, 230),
        appBar: AppBar(
          title: Text("Cihuyyy!"),
          backgroundColor: const Color.fromARGB(255, 255, 255, 255),
        ),
        body: Center(
          child: Image(image: AssetImage('images/Glass_Flower.jpg')),
        ),
      ),
    ),
  );
}
