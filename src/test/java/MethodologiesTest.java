import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;

import java.sql.PreparedStatement;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MethodologiesTest {

    private static double[][] quads, dists;
    private static int[][] speeds;


    @BeforeAll
    static void setUp() {
        quads = new double[][]{{5, -8, 3, 1.00, 0.60}, {3, 2, -7, 1.23, -1.90}, {9, 6, 1, -0.33, -0.33}};
        dists = new double[][]{{1, 1, 2, 1, 1.000}, {1, 1, -2, 2, 3.162}, {1, 1, 0, 0, 1.414}};
        speeds = new int[][]{{45, 0, 32, 84}, {96, 1, 43, 56}, {100, 2, 25, 41}, {50, 2, 25, 21}, {10, 10, 19, 1}, {100, 50, 77, 2}};
    }



    private static Stream<Arguments> providedInts_allQuads() {
        return Stream.of(
                Arguments.of((int)quads[0][0],(int)quads[0][1],(int)quads[0][2],quads[0][3]),
                Arguments.of((int)quads[1][0],(int)quads[1][1],(int)quads[1][2],quads[1][3]),
                Arguments.of((int)quads[2][0],(int)quads[2][1],(int)quads[2][2],quads[2][3])
        );
    }

    @DisplayName("Calculating the addition roots from a quad")
    @ParameterizedTest
    @MethodSource ("providedInts_allQuads")
    void addroot_variousCoeefs_allValid_returnAddRoots (int a, int b, int c, double root) {
        double res = Methodologies.getRootAdd(a,b,c);
        assertEquals(root, res, .03);
    }


    private static Stream<Arguments> providedInts_allQuads2() {
        return Stream.of(
                Arguments.of((int)quads[0][0],(int)quads[0][1],(int)quads[0][2],quads[0][4]),
                Arguments.of((int)quads[1][0],(int)quads[1][1],(int)quads[1][2],quads[1][4]),
                Arguments.of((int)quads[2][0],(int)quads[2][1],(int)quads[2][2],quads[2][4])
        );
    }

    @DisplayName("Calculating the subtraction roots from a quad")
    @ParameterizedTest
    @MethodSource ("providedInts_allQuads2")
    void subroot_variousCoeefs_allValid_returnSubRoots (int a, int b, int c, double root) {
        double res = Methodologies.getRootSub(a,b,c);
        assertEquals(root, res, .03);
    }

    private static Stream<Arguments> providedInts_allDists() {
        return Stream.of(
                Arguments.of((int)dists[0][0],(int)dists[0][1],(int)dists[0][2],(int)dists[0][3],dists[0][4]),
                Arguments.of((int)dists[1][0],(int)dists[1][1],(int)dists[1][2],(int)dists[1][3],dists[1][4]),
                Arguments.of((int)dists[2][0],(int)dists[2][1],(int)dists[2][2],(int)dists[2][3],dists[2][4])
        );
    }

    @DisplayName("Calculating the distances")
    @ParameterizedTest
    @MethodSource ("providedInts_allDists")
    void dists_variousCoords_allValid_returnDistances (int x1, int y1, int x2, int y2, double exp) {
        double res = Methodologies.howFar(x1,y1,x2,y2);
        assertEquals(exp, res, .003);
    }

    private static Stream<Arguments> providedInts_allSpeeds() {
        return Stream.of(
                Arguments.of(speeds[0][0],speeds[0][1],speeds[0][2],speeds[0][3]),
                Arguments.of(speeds[1][0],speeds[1][1],speeds[1][2],speeds[1][3]),
                Arguments.of(speeds[2][0],speeds[2][1],speeds[2][2],speeds[2][3]),
                Arguments.of(speeds[3][0],speeds[3][1],speeds[3][2],speeds[3][3]),
                Arguments.of(speeds[4][0],speeds[4][1],speeds[4][2],speeds[4][3]),
                Arguments.of(speeds[5][0],speeds[5][1],speeds[5][2],speeds[5][3])
        );
    }

    @DisplayName("Calculating the speeds")
    @ParameterizedTest
    @MethodSource ("providedInts_allSpeeds")
    void speeds_variousValues_allValid_returnSpeeds (int d, int h, int m, double exp) {
        double res = Methodologies.howFast(d,h,m);
        assertEquals(exp, res,0.3);
    }


}