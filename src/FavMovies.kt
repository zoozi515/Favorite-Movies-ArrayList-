fun main() {
    val movieList = ArrayList<String>()

    println("Enter your favorite movies: ")
    var i = 1
    while(i <= 3){
        movieList.add(readLine().toString())
        if (i == 3) {
            print("Do you want to continue? (Y/N): ")
            val ans = readLine().toString()
            if (ans == "N" || ans == "n")
                break
            else if (ans == "Y" || ans == "y") {
                i --
                println("Enter a movie: ")
            }
        }
        i++
    }

    println("Your top 5 movies are: ")
    for(mov in movieList)
        println(mov)
}