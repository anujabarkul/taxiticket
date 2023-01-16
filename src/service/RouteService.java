package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Route;

public class RouteService {

	List<Route> routeList = new ArrayList<Route>();

	public boolean addRoute(Route objRoute) {

		Route opRoute = getRoute(objRoute);

		if (null == opRoute) {
			routeList.add(objRoute);
			return true;
		}
		return false;
	}

	public Route getRoute(Route objRoute) {
		
		List<Route> opRouteList = routeList.stream().filter(

				route -> (route.getFrom().equalsIgnoreCase(objRoute.getFrom())
						&& route.getTo().equalsIgnoreCase(objRoute.getTo()))
						|| (route.getFrom().equalsIgnoreCase(objRoute.getTo())
								&& route.getTo().equalsIgnoreCase(objRoute.getFrom())))
				.collect(Collectors.toList());

		if (!opRouteList.isEmpty()) {
			return opRouteList.get(0);
		}
		return null;
	}

}
