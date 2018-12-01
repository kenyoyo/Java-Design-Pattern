
public class MovieResource implements IResource {

	private Movie movie;

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String getMainResource() {
		return movie.getMovieName();
	}

	@Override
	public String getOtherResource() {
		return movie.getDirectorName();
	}

}
