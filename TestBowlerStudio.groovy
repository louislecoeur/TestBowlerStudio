// code here// we use cube and sphere as base geometries
CSG cube = new Cube(15).toCSG();
CSG sphere = new Sphere(11).toCSG();

// perform union, difference and intersection
//CSG cubePlusSphere = cube.union(sphere);
CSG cubeMinusSphere = cube.difference(sphere);
// CSG cubeIntersectSphere = cube.intersect(sphere);