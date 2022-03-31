package com.company;

public class Movie
{
    //variables nativas de la clase
    private int idMovie;
    public String movieTitle;
    public String movieDirector;
    public String movieGenre;
    protected int movieDuration;

    //constructores
    public Movie()
    {
        idMovie=0001;
        movieTitle="Titanic";
        movieDirector="James Cameron";
        movieGenre="Drama Histórico";
        movieDuration=194;
    }

    public Movie(int idMovie, String movieTitle, String movieDirector, String movieGenre, int movieDuration)
    {
        this();
        this.idMovie=idMovie;
        this.movieTitle=movieTitle;
        this.movieDirector=movieDirector;
        this.movieGenre=movieGenre;
        this.movieDuration=movieDuration;
    }
    //fin constructores

    //métodos
    private int getIdMovie()
    {
        return idMovie;
    }

    private void setIdMovie(int idMovie)
    {
        this.idMovie=idMovie;
    }

    public String getMovieTitle()
    {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle)
    {
        this.movieTitle=movieTitle;
    }

    public String getMovieDirector()
    {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector)
    {
        this.movieDirector=movieDirector;
    }

    public String getMovieGenre(String movieGenreo)
    {
        return movieGenreo;
    }

    public void setMovieGenre(String movieGenre)
    {
        this.movieGenre=movieGenre;
    }

    protected int getMovieDuration()
    {
        return movieDuration;
    }

    protected void setMovieDuration(int movieDuration)
    {
        this.movieDuration=movieDuration;
    }
    //fin métodos
}
