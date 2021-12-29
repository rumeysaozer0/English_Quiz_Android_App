package com.rumeysaozer.quizaplication

object Constants {


    fun getQuestions(): ArrayList<Soru>{
        val questionList = ArrayList<Soru>()

        val question1 = Soru(1,"What is the meaning of the word below?", "Miracle", "Ayna", "Mucize","Serap","Mucit",2)
        questionList.add(question1)
        val question2 = Soru(2,"What is the meaning of the word below?", "Appear", "Gözükmek", "Bulunmak","Elma","Uygulama",1)
        questionList.add(question2)
        val question3 = Soru(3,"What is the meaning of the word below?", "Beside", "Saygı", "Dışında","Rağmen","Yanında",4)
        questionList.add(question3)
        val question4 = Soru(4,"What is the meaning of the word below?", "Certain", "Belirli", "Kesin","Serin","Yanlış",2)
        questionList.add(question4)
        val question5 = Soru(5,"What is the meaning of the word below?", "Determine", "Tespit Etmek", "Algılamak","Belirlemek","Caydırmak",3)
        questionList.add(question5)
        val question6 = Soru(6,"What is the meaning of the word below?", "Entire", "Tüm", "Girmek","Eğlence","Girişimci",1)
        questionList.add(question6)
        val question7 = Soru(7,"What is the meaning of the word below?", "Fact", "Adil", "Yüz","Gerçek","Fabrika",3)
        questionList.add(question7)
        val question8 = Soru(8,"What is the meaning of the word below?", "Grass", "Çimen", "Seviye","Çekirge","Sıkı Tutmak",1)
        questionList.add(question8)
        val question9 = Soru(9,"What is the meaning of the word below?", "Heavy", "Sıcaklık", "Duymak","Ağır","Cennet",3)
        questionList.add(question9)
        val question10 = Soru(10,"What is the meaning of the word below?", "Indicate", "Gösterge", "Bireysel","Belirtilen","Göstermek",4)
        questionList.add(question10)

        return questionList
    }
}