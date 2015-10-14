package tn.mario.moovtn.utilities;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.mario.moovtn.entities.Line;
import tn.mario.moovtn.entities.Station;
import tn.mario.moovtn.remotes.LineRemote;
import tn.mario.moovtn.remotes.StationRemote;

/**
 * Session Bean implementation class PopulateDB
 */
@Singleton
@LocalBean
@Startup
public class PopulateDB {
	@EJB
	private LineRemote lineRemote;
	@EJB
	private StationRemote stationRemote;

	/**
	 * Default constructor.
	 */
	public PopulateDB() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDB() {
		Line line = new Line("TUN-RAOUED", "DIMA TOUL", "BUS");

		Station station = new Station("TUN", 1234D, 125D, "TERM");

		List<Station> stations = new ArrayList<>();
		stations.add(station);

		line.setStations(stations);

		lineRemote.updateLine(line);
	}

}
