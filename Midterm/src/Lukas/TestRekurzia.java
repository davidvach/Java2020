package Lukas;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestRekurzia {
    @BeforeClass
    public static void initScoring() {
    }

    @Test
    public void testfoo() {
        assertEquals("foo(5,23)", 1937199L, Rekurzia.foo(5, 23));
        assertEquals("foo(6,24)", 19665841L, Rekurzia.foo(6, 24));
        assertEquals("foo(7,6)", 19825L, Rekurzia.foo(7, 6));
        assertEquals("foo(4,9)", 5641L, Rekurzia.foo(4, 9));
        assertEquals("foo(11,18)", 5812626185L, Rekurzia.foo(11, 18));
        assertEquals("foo(0,3)", 1L, Rekurzia.foo(0, 3));
        assertEquals("foo(18,13)", 60592003085L, Rekurzia.foo(18, 13));
        assertEquals("foo(8,16)", 39490049L, Rekurzia.foo(8, 16));
        assertEquals("foo(22,10)", 10753517061L, Rekurzia.foo(22, 10));
        assertEquals("foo(2,21)", 925L, Rekurzia.foo(2, 21));
        assertEquals("foo(14,2)", 421L, Rekurzia.foo(14, 2));
        assertEquals("foo(22,3)", 15225L, Rekurzia.foo(22, 3));
        assertEquals("foo(7,12)", 1392065L, Rekurzia.foo(7, 12));
        assertEquals("foo(11,12)", 103274625L, Rekurzia.foo(11, 12));
        assertEquals("foo(26,7)", 240673265L, Rekurzia.foo(26, 7));
        assertEquals("foo(9,11)", 7059735L, Rekurzia.foo(9, 11));
        assertEquals("foo(24,18)", 815272900198321L, Rekurzia.foo(24, 18));
        assertEquals("foo(14,12)", 1267854873L, Rekurzia.foo(14, 12));
        assertEquals("foo(4,17)", 63241L, Rekurzia.foo(4, 17));
        assertEquals("foo(19,24)", 2358243122728129L, Rekurzia.foo(19, 24));
        assertEquals("foo(22,22)", 8443414161166173L, Rekurzia.foo(22, 22));
        assertEquals("foo(11,14)", 464387817L, Rekurzia.foo(11, 14));
        assertEquals("foo(26,8)", 1621925137L, Rekurzia.foo(26, 8));
        assertEquals("foo(20,20)", 260543813797441L, Rekurzia.foo(20, 20));
        assertEquals("foo(8,16)", 39490049L, Rekurzia.foo(8, 16));
        assertEquals("foo(23,19)", 1136725029892031L, Rekurzia.foo(23, 19));
        assertEquals("foo(22,24)", 45308321651001521L, Rekurzia.foo(22, 24));
        assertEquals("foo(1,1)", 3L, Rekurzia.foo(1, 1));
        assertEquals("foo(17,13)", 30845044155L, Rekurzia.foo(17, 13));
        assertEquals("foo(8,13)", 8405905L, Rekurzia.foo(8, 13));
        assertEquals("foo(19,2)", 761L, Rekurzia.foo(19, 2));
        assertEquals("foo(21,10)", 6911195501L, Rekurzia.foo(21, 10));
        assertEquals("foo(11,12)", 103274625L, Rekurzia.foo(11, 12));
        assertEquals("foo(21,4)", 143529L, Rekurzia.foo(21, 4));
        assertEquals("foo(25,2)", 1301L, Rekurzia.foo(25, 2));
        assertEquals("foo(9,24)", 4876601009L, Rekurzia.foo(9, 24));
        assertEquals("foo(17,10)", 948062325L, Rekurzia.foo(17, 10));
        assertEquals("foo(2,19)", 761L, Rekurzia.foo(2, 19));
        assertEquals("foo(22,6)", 11847485L, Rekurzia.foo(22, 6));
        assertEquals("foo(8,10)", 1256465L, Rekurzia.foo(8, 10));
        assertEquals("foo(20,11)", 17152640321L, Rekurzia.foo(20, 11));
        assertEquals("foo(13,4)", 22569L, Rekurzia.foo(13, 4));
        assertEquals("foo(23,23)", 48141245001931263L, Rekurzia.foo(23, 23));
        assertEquals("foo(22,5)", 1560549L, Rekurzia.foo(22, 5));
        assertEquals("foo(24,16)", 85275509086721L, Rekurzia.foo(24, 16));
        assertEquals("foo(20,7)", 40754369L, Rekurzia.foo(20, 7));
        assertEquals("foo(11,8)", 2485825L, Rekurzia.foo(11, 8));
        assertEquals("foo(4,23)", 204609L, Rekurzia.foo(4, 23));
        assertEquals("foo(10,5)", 36365L, Rekurzia.foo(10, 5));
        assertEquals("foo(19,2)", 761L, Rekurzia.foo(19, 2));
        assertEquals("foo(1,8)", 17L, Rekurzia.foo(1, 8));
        assertEquals("foo(4,7)", 2241L, Rekurzia.foo(4, 7));
        assertEquals("foo(18,10)", 1616336765L, Rekurzia.foo(18, 10));
        assertEquals("foo(18,11)", 5812626185L, Rekurzia.foo(18, 11));
        assertEquals("foo(20,9)", 1014889769L, Rekurzia.foo(20, 9));
        assertEquals("foo(15,0)", 1L, Rekurzia.foo(15, 0));
        assertEquals("foo(24,0)", 1L, Rekurzia.foo(24, 0));
        assertEquals("foo(13,13)", 1409933619L, Rekurzia.foo(13, 13));
        assertEquals("foo(8,21)", 312193553L, Rekurzia.foo(8, 21));
        assertEquals("foo(15,1)", 31L, Rekurzia.foo(15, 1));
        assertEquals("foo(26,23)", 577524957781467857L, Rekurzia.foo(26, 23));
        assertEquals("foo(5,18)", 590557L, Rekurzia.foo(5, 18));
        assertEquals("foo(1,16)", 33L, Rekurzia.foo(1, 16));
        assertEquals("foo(15,3)", 4991L, Rekurzia.foo(15, 3));
        assertEquals("foo(6,1)", 13L, Rekurzia.foo(6, 1));
        assertEquals("foo(24,3)", 19649L, Rekurzia.foo(24, 3));
        assertEquals("foo(11,19)", 10113604735L, Rekurzia.foo(11, 19));
        assertEquals("foo(1,12)", 25L, Rekurzia.foo(1, 12));
        assertEquals("foo(20,16)", 5931412422529L, Rekurzia.foo(20, 16));
        assertEquals("foo(18,16)", 1314016698401L, Rekurzia.foo(18, 16));
        assertEquals("foo(21,15)", 4027517246239L, Rekurzia.foo(21, 15));
        assertEquals("foo(2,14)", 421L, Rekurzia.foo(2, 14));
        assertEquals("foo(10,10)", 8097453L, Rekurzia.foo(10, 10));
        assertEquals("foo(22,16)", 23697618246945L, Rekurzia.foo(22, 16));
        assertEquals("foo(25,14)", 12455603988461L, Rekurzia.foo(25, 14));
        assertEquals("foo(10,12)", 39753273L, Rekurzia.foo(10, 12));
        assertEquals("foo(3,2)", 25L, Rekurzia.foo(3, 2));
        assertEquals("foo(4,15)", 39041L, Rekurzia.foo(4, 15));
        assertEquals("foo(8,8)", 265729L, Rekurzia.foo(8, 8));
        assertEquals("foo(5,12)", 85305L, Rekurzia.foo(5, 12));
        assertEquals("foo(0,15)", 1L, Rekurzia.foo(0, 15));
        assertEquals("foo(25,3)", 22151L, Rekurzia.foo(25, 3));
        assertEquals("foo(9,5)", 22363L, Rekurzia.foo(9, 5));
        assertEquals("foo(17,5)", 448427L, Rekurzia.foo(17, 5));
        assertEquals("foo(10,22)", 10753517061L, Rekurzia.foo(10, 22));
        assertEquals("foo(21,4)", 143529L, Rekurzia.foo(21, 4));
        assertEquals("foo(9,2)", 181L, Rekurzia.foo(9, 2));
        assertEquals("foo(18,11)", 5812626185L, Rekurzia.foo(18, 11));
        assertEquals("foo(5,7)", 7183L, Rekurzia.foo(5, 7));
        assertEquals("foo(3,9)", 1159L, Rekurzia.foo(3, 9));
        assertEquals("foo(0,20)", 1L, Rekurzia.foo(0, 20));
        assertEquals("foo(9,3)", 1159L, Rekurzia.foo(9, 3));
        assertEquals("foo(7,8)", 108545L, Rekurzia.foo(7, 8));
        assertEquals("foo(1,20)", 41L, Rekurzia.foo(1, 20));
        assertEquals("foo(3,24)", 19649L, Rekurzia.foo(3, 24));
        assertEquals("foo(9,13)", 27298155L, Rekurzia.foo(9, 13));
        assertEquals("foo(21,15)", 4027517246239L, Rekurzia.foo(21, 15));
        assertEquals("foo(15,4)", 39041L, Rekurzia.foo(15, 4));
        assertEquals("foo(15,16)", 103706427393L, Rekurzia.foo(15, 16));
        assertEquals("foo(3,4)", 129L, Rekurzia.foo(3, 4));
        long[] results = new long[]{1L, 3L, 13L, 63L, 321L, 1683L, 8989L, 48639L, 265729L, 1462563L, 8097453L, 45046719L, 251595969L, 1409933619L, 7923848253L, 44642381823L, 252055236609L, 1425834724419L, 8079317057869L, 45849429914943L, 260543813797441L, 1482376214227923L, 8443414161166173L, 48141245001931263L, 274738209148561921L, 1569245074591690083L, 8970232353223635949L};
        for (int i = 0; i < results.length; i++) {
            assertEquals("foo " + i + "L,  " + i,
                    results[i],
                    Rekurzia.foo(i, i));
            ;
        }
    }

    @Test
    public void testVOboreHodnot() {
        assertTrue("zOboruHodnot(115326046215)", Rekurzia.zOboruHodnot(115326046215L));
        assertFalse("zOboruHodnot(2306520924304)", Rekurzia.zOboruHodnot(2306520924304L));
        assertTrue("zOboruHodnot(17343)", Rekurzia.zOboruHodnot(17343L));
        assertFalse("zOboruHodnot(346864)", Rekurzia.zOboruHodnot(346864L));
        assertTrue("zOboruHodnot(269902623450929)", Rekurzia.zOboruHodnot(269902623450929L));
        assertFalse("zOboruHodnot(5398052469018584)", Rekurzia.zOboruHodnot(5398052469018584L));
        assertTrue("zOboruHodnot(30845044155)", Rekurzia.zOboruHodnot(30845044155L));
        assertFalse("zOboruHodnot(616900883104)", Rekurzia.zOboruHodnot(616900883104L));
        assertTrue("zOboruHodnot(21)", Rekurzia.zOboruHodnot(21L));
        assertFalse("zOboruHodnot(424)", Rekurzia.zOboruHodnot(424L));
        assertTrue("zOboruHodnot(243025194476551)", Rekurzia.zOboruHodnot(243025194476551L));
        assertFalse("zOboruHodnot(4860503889531024)", Rekurzia.zOboruHodnot(4860503889531024L));
        assertTrue("zOboruHodnot(9173505)", Rekurzia.zOboruHodnot(9173505L));
        assertFalse("zOboruHodnot(183470104)", Rekurzia.zOboruHodnot(183470104L));
        assertTrue("zOboruHodnot(19649)", Rekurzia.zOboruHodnot(19649L));
        assertFalse("zOboruHodnot(392984)", Rekurzia.zOboruHodnot(392984L));
        assertTrue("zOboruHodnot(354071970265)", Rekurzia.zOboruHodnot(354071970265L));
        assertFalse("zOboruHodnot(7081439405304)", Rekurzia.zOboruHodnot(7081439405304L));
        assertTrue("zOboruHodnot(4673345)", Rekurzia.zOboruHodnot(4673345L));
        assertFalse("zOboruHodnot(93466904)", Rekurzia.zOboruHodnot(93466904L));
        assertTrue("zOboruHodnot(880685)", Rekurzia.zOboruHodnot(880685L));
        assertFalse("zOboruHodnot(17613704)", Rekurzia.zOboruHodnot(17613704L));
        assertTrue("zOboruHodnot(4673345)", Rekurzia.zOboruHodnot(4673345L));
        assertFalse("zOboruHodnot(93466904)", Rekurzia.zOboruHodnot(93466904L));
        assertTrue("zOboruHodnot(139125084109615)", Rekurzia.zOboruHodnot(139125084109615L));
        assertFalse("zOboruHodnot(2782501682192304)", Rekurzia.zOboruHodnot(2782501682192304L));
        assertTrue("zOboruHodnot(354071970265)", Rekurzia.zOboruHodnot(354071970265L));
        assertFalse("zOboruHodnot(7081439405304)", Rekurzia.zOboruHodnot(7081439405304L));
        assertTrue("zOboruHodnot(10753517061)", Rekurzia.zOboruHodnot(10753517061L));
        assertFalse("zOboruHodnot(215070341224)", Rekurzia.zOboruHodnot(215070341224L));
        assertTrue("zOboruHodnot(13)", Rekurzia.zOboruHodnot(13L));
        assertFalse("zOboruHodnot(264)", Rekurzia.zOboruHodnot(264L));
        assertTrue("zOboruHodnot(1482376214227923)", Rekurzia.zOboruHodnot(1482376214227923L));
        assertFalse("zOboruHodnot(29647524284558464)", Rekurzia.zOboruHodnot(29647524284558464L));
        assertTrue("zOboruHodnot(12023876986657)", Rekurzia.zOboruHodnot(12023876986657L));
        assertFalse("zOboruHodnot(240477539733144)", Rekurzia.zOboruHodnot(240477539733144L));
        assertTrue("zOboruHodnot(613)", Rekurzia.zOboruHodnot(613L));
        assertFalse("zOboruHodnot(12264)", Rekurzia.zOboruHodnot(12264L));
        assertTrue("zOboruHodnot(100609937775369981)", Rekurzia.zOboruHodnot(100609937775369981L));
        assertFalse("zOboruHodnot(2012198755507399624)", Rekurzia.zOboruHodnot(2012198755507399624L));
        assertTrue("zOboruHodnot(27)", Rekurzia.zOboruHodnot(27L));
        assertFalse("zOboruHodnot(544)", Rekurzia.zOboruHodnot(544L));
        assertTrue("zOboruHodnot(37)", Rekurzia.zOboruHodnot(37L));
        assertFalse("zOboruHodnot(744)", Rekurzia.zOboruHodnot(744L));
        assertTrue("zOboruHodnot(77500017)", Rekurzia.zOboruHodnot(77500017L));
        assertFalse("zOboruHodnot(1550000344)", Rekurzia.zOboruHodnot(1550000344L));
        assertTrue("zOboruHodnot(1)", Rekurzia.zOboruHodnot(1L));
        assertFalse("zOboruHodnot(24)", Rekurzia.zOboruHodnot(24L));
        assertTrue("zOboruHodnot(377)", Rekurzia.zOboruHodnot(377L));
        assertFalse("zOboruHodnot(7544)", Rekurzia.zOboruHodnot(7544L));
        assertTrue("zOboruHodnot(114375683009)", Rekurzia.zOboruHodnot(114375683009L));
        assertFalse("zOboruHodnot(2287513660184)", Rekurzia.zOboruHodnot(2287513660184L));
        assertTrue("zOboruHodnot(1)", Rekurzia.zOboruHodnot(1L));
        assertFalse("zOboruHodnot(24)", Rekurzia.zOboruHodnot(24L));
        assertTrue("zOboruHodnot(85275509086721)", Rekurzia.zOboruHodnot(85275509086721L));
        assertFalse("zOboruHodnot(1705510181734424)", Rekurzia.zOboruHodnot(1705510181734424L));
        assertTrue("zOboruHodnot(766727)", Rekurzia.zOboruHodnot(766727L));
        assertFalse("zOboruHodnot(15334544)", Rekurzia.zOboruHodnot(15334544L));
        assertTrue("zOboruHodnot(129)", Rekurzia.zOboruHodnot(129L));
        assertFalse("zOboruHodnot(2584)", Rekurzia.zOboruHodnot(2584L));
        assertTrue("zOboruHodnot(124515)", Rekurzia.zOboruHodnot(124515L));
        assertFalse("zOboruHodnot(2490304)", Rekurzia.zOboruHodnot(2490304L));
        assertTrue("zOboruHodnot(17534423944871729)", Rekurzia.zOboruHodnot(17534423944871729L));
        assertFalse("zOboruHodnot(350688478897434584)", Rekurzia.zOboruHodnot(350688478897434584L));
        assertTrue("zOboruHodnot(654862247)", Rekurzia.zOboruHodnot(654862247L));
        assertFalse("zOboruHodnot(13097244944)", Rekurzia.zOboruHodnot(13097244944L));
        assertTrue("zOboruHodnot(53)", Rekurzia.zOboruHodnot(53L));
        assertFalse("zOboruHodnot(1064)", Rekurzia.zOboruHodnot(1064L));
        assertTrue("zOboruHodnot(579168825)", Rekurzia.zOboruHodnot(579168825L));
        assertFalse("zOboruHodnot(11583376504)", Rekurzia.zOboruHodnot(11583376504L));
        assertTrue("zOboruHodnot(31388293)", Rekurzia.zOboruHodnot(31388293L));
        assertFalse("zOboruHodnot(627765864)", Rekurzia.zOboruHodnot(627765864L));
        assertTrue("zOboruHodnot(10343052825)", Rekurzia.zOboruHodnot(10343052825L));
        assertFalse("zOboruHodnot(206861056504)", Rekurzia.zOboruHodnot(206861056504L));
        assertTrue("zOboruHodnot(1105)", Rekurzia.zOboruHodnot(1105L));
        assertFalse("zOboruHodnot(22104)", Rekurzia.zOboruHodnot(22104L));
        assertTrue("zOboruHodnot(35)", Rekurzia.zOboruHodnot(35L));
        assertFalse("zOboruHodnot(704)", Rekurzia.zOboruHodnot(704L));
        assertTrue("zOboruHodnot(78706989441761)", Rekurzia.zOboruHodnot(78706989441761L));
        assertFalse("zOboruHodnot(1574139788835224)", Rekurzia.zOboruHodnot(1574139788835224L));
        assertTrue("zOboruHodnot(93065296937533)", Rekurzia.zOboruHodnot(93065296937533L));
        assertFalse("zOboruHodnot(1861305938750664)", Rekurzia.zOboruHodnot(1861305938750664L));
        assertTrue("zOboruHodnot(1)", Rekurzia.zOboruHodnot(1L));
        assertFalse("zOboruHodnot(24)", Rekurzia.zOboruHodnot(24L));
        assertTrue("zOboruHodnot(2241)", Rekurzia.zOboruHodnot(2241L));
        assertFalse("zOboruHodnot(44824)", Rekurzia.zOboruHodnot(44824L));
        assertTrue("zOboruHodnot(1196924561)", Rekurzia.zOboruHodnot(1196924561L));
        assertFalse("zOboruHodnot(23938491224)", Rekurzia.zOboruHodnot(23938491224L));
        assertTrue("zOboruHodnot(628496897)", Rekurzia.zOboruHodnot(628496897L));
        assertFalse("zOboruHodnot(12569937944)", Rekurzia.zOboruHodnot(12569937944L));
        assertTrue("zOboruHodnot(3)", Rekurzia.zOboruHodnot(3L));
        assertFalse("zOboruHodnot(64)", Rekurzia.zOboruHodnot(64L));
        assertTrue("zOboruHodnot(16429137361)", Rekurzia.zOboruHodnot(16429137361L));
        assertFalse("zOboruHodnot(328582747224)", Rekurzia.zOboruHodnot(328582747224L));
        assertTrue("zOboruHodnot(1937199)", Rekurzia.zOboruHodnot(1937199L));
        assertFalse("zOboruHodnot(38743984)", Rekurzia.zOboruHodnot(38743984L));
        assertTrue("zOboruHodnot(41)", Rekurzia.zOboruHodnot(41L));
        assertFalse("zOboruHodnot(824)", Rekurzia.zOboruHodnot(824L));
        assertTrue("zOboruHodnot(5812626185)", Rekurzia.zOboruHodnot(5812626185L));
        assertFalse("zOboruHodnot(116252523704)", Rekurzia.zOboruHodnot(116252523704L));
        assertTrue("zOboruHodnot(3649)", Rekurzia.zOboruHodnot(3649L));
        assertFalse("zOboruHodnot(72984)", Rekurzia.zOboruHodnot(72984L));
        assertTrue("zOboruHodnot(9765268709)", Rekurzia.zOboruHodnot(9765268709L));
        assertFalse("zOboruHodnot(195305374184)", Rekurzia.zOboruHodnot(195305374184L));
        assertTrue("zOboruHodnot(330409)", Rekurzia.zOboruHodnot(330409L));
        assertFalse("zOboruHodnot(6608184)", Rekurzia.zOboruHodnot(6608184L));
        assertTrue("zOboruHodnot(3375210671)", Rekurzia.zOboruHodnot(3375210671L));
        assertFalse("zOboruHodnot(67504213424)", Rekurzia.zOboruHodnot(67504213424L));
        assertTrue("zOboruHodnot(103706427393)", Rekurzia.zOboruHodnot(103706427393L));
        assertFalse("zOboruHodnot(2074128547864)", Rekurzia.zOboruHodnot(2074128547864L));
        assertTrue("zOboruHodnot(2838240338817)", Rekurzia.zOboruHodnot(2838240338817L));
        assertFalse("zOboruHodnot(56764806776344)", Rekurzia.zOboruHodnot(56764806776344L));
        assertTrue("zOboruHodnot(2668525)", Rekurzia.zOboruHodnot(2668525L));
        assertFalse("zOboruHodnot(53370504)", Rekurzia.zOboruHodnot(53370504L));
        assertTrue("zOboruHodnot(1256465)", Rekurzia.zOboruHodnot(1256465L));
        assertFalse("zOboruHodnot(25129304)", Rekurzia.zOboruHodnot(25129304L));
        assertTrue("zOboruHodnot(152951073)", Rekurzia.zOboruHodnot(152951073L));
        assertFalse("zOboruHodnot(3059021464)", Rekurzia.zOboruHodnot(3059021464L));
        assertTrue("zOboruHodnot(15)", Rekurzia.zOboruHodnot(15L));
        assertFalse("zOboruHodnot(304)", Rekurzia.zOboruHodnot(304L));
        assertTrue("zOboruHodnot(1621925137)", Rekurzia.zOboruHodnot(1621925137L));
        assertFalse("zOboruHodnot(32438502744)", Rekurzia.zOboruHodnot(32438502744L));
        assertTrue("zOboruHodnot(115326046215)", Rekurzia.zOboruHodnot(115326046215L));
        assertFalse("zOboruHodnot(2306520924304)", Rekurzia.zOboruHodnot(2306520924304L));
        assertTrue("zOboruHodnot(3800305)", Rekurzia.zOboruHodnot(3800305L));
        assertFalse("zOboruHodnot(76006104)", Rekurzia.zOboruHodnot(76006104L));
        assertTrue("zOboruHodnot(75517)", Rekurzia.zOboruHodnot(75517L));
        assertFalse("zOboruHodnot(1510344)", Rekurzia.zOboruHodnot(1510344L));
        assertTrue("zOboruHodnot(579125)", Rekurzia.zOboruHodnot(579125L));
        assertFalse("zOboruHodnot(11582504)", Rekurzia.zOboruHodnot(11582504L));
        assertTrue("zOboruHodnot(2241)", Rekurzia.zOboruHodnot(2241L));
        assertFalse("zOboruHodnot(44824)", Rekurzia.zOboruHodnot(44824L));
        assertTrue("zOboruHodnot(2908411)", Rekurzia.zOboruHodnot(2908411L));
        assertFalse("zOboruHodnot(58168224)", Rekurzia.zOboruHodnot(58168224L));
        assertTrue("zOboruHodnot(1)", Rekurzia.zOboruHodnot(1L));
        assertFalse("zOboruHodnot(24)", Rekurzia.zOboruHodnot(24L));
        assertTrue("zOboruHodnot(5812626185)", Rekurzia.zOboruHodnot(5812626185L));
        assertFalse("zOboruHodnot(116252523704)", Rekurzia.zOboruHodnot(116252523704L));
        assertTrue("zOboruHodnot(766727)", Rekurzia.zOboruHodnot(766727L));
        assertFalse("zOboruHodnot(15334544)", Rekurzia.zOboruHodnot(15334544L));
        assertTrue("zOboruHodnot(50049)", Rekurzia.zOboruHodnot(50049L));
        assertFalse("zOboruHodnot(1000984)", Rekurzia.zOboruHodnot(1000984L));
        assertTrue("zOboruHodnot(1937199)", Rekurzia.zOboruHodnot(1937199L));
        assertFalse("zOboruHodnot(38743984)", Rekurzia.zOboruHodnot(38743984L));
        assertTrue("zOboruHodnot(1405)", Rekurzia.zOboruHodnot(1405L));
        assertFalse("zOboruHodnot(28104)", Rekurzia.zOboruHodnot(28104L));
        assertTrue("zOboruHodnot(19825)", Rekurzia.zOboruHodnot(19825L));
        assertFalse("zOboruHodnot(396504)", Rekurzia.zOboruHodnot(396504L));
        assertTrue("zOboruHodnot(7283926286641)", Rekurzia.zOboruHodnot(7283926286641L));
        assertFalse("zOboruHodnot(145678525732824)", Rekurzia.zOboruHodnot(145678525732824L));
        assertTrue("zOboruHodnot(11847485)", Rekurzia.zOboruHodnot(11847485L));
        assertFalse("zOboruHodnot(236949704)", Rekurzia.zOboruHodnot(236949704L));
        assertTrue("zOboruHodnot(312193553)", Rekurzia.zOboruHodnot(312193553L));
        assertFalse("zOboruHodnot(6243871064)", Rekurzia.zOboruHodnot(6243871064L));
        assertTrue("zOboruHodnot(18474633)", Rekurzia.zOboruHodnot(18474633L));
        assertFalse("zOboruHodnot(369492664)", Rekurzia.zOboruHodnot(369492664L));
        assertTrue("zOboruHodnot(413442773)", Rekurzia.zOboruHodnot(413442773L));
        assertFalse("zOboruHodnot(8268855464)", Rekurzia.zOboruHodnot(8268855464L));
        assertTrue("zOboruHodnot(302016962625)", Rekurzia.zOboruHodnot(302016962625L));
        assertFalse("zOboruHodnot(6040339252504)", Rekurzia.zOboruHodnot(6040339252504L));
        assertTrue("zOboruHodnot(79321148551544333)", Rekurzia.zOboruHodnot(79321148551544333L));
        assertFalse("zOboruHodnot(1586422971030886664)", Rekurzia.zOboruHodnot(1586422971030886664L));
        assertTrue("zOboruHodnot(1561)", Rekurzia.zOboruHodnot(1561L));
        assertFalse("zOboruHodnot(31224)", Rekurzia.zOboruHodnot(31224L));
        assertTrue("zOboruHodnot(29)", Rekurzia.zOboruHodnot(29L));
        assertFalse("zOboruHodnot(584)", Rekurzia.zOboruHodnot(584L));
        assertTrue("zOboruHodnot(1159)", Rekurzia.zOboruHodnot(1159L));
        assertFalse("zOboruHodnot(23184)", Rekurzia.zOboruHodnot(23184L));
        assertTrue("zOboruHodnot(1560549)", Rekurzia.zOboruHodnot(1560549L));
        assertFalse("zOboruHodnot(31210984)", Rekurzia.zOboruHodnot(31210984L));
        assertTrue("zOboruHodnot(45354821113631)", Rekurzia.zOboruHodnot(45354821113631L));
        assertFalse("zOboruHodnot(907096422272624)", Rekurzia.zOboruHodnot(907096422272624L));
        assertTrue("zOboruHodnot(85305)", Rekurzia.zOboruHodnot(85305L));
        assertFalse("zOboruHodnot(1706104)", Rekurzia.zOboruHodnot(1706104L));
        assertTrue("zOboruHodnot(628496897)", Rekurzia.zOboruHodnot(628496897L));
        assertFalse("zOboruHodnot(12569937944)", Rekurzia.zOboruHodnot(12569937944L));
        assertTrue("zOboruHodnot(31388293)", Rekurzia.zOboruHodnot(31388293L));
        assertFalse("zOboruHodnot(627765864)", Rekurzia.zOboruHodnot(627765864L));
        assertTrue("zOboruHodnot(114375683009)", Rekurzia.zOboruHodnot(114375683009L));
        assertFalse("zOboruHodnot(2287513660184)", Rekurzia.zOboruHodnot(2287513660184L));
        assertTrue("zOboruHodnot(85305)", Rekurzia.zOboruHodnot(85305L));
        assertFalse("zOboruHodnot(1706104)", Rekurzia.zOboruHodnot(1706104L));
        assertTrue("zOboruHodnot(96220561)", Rekurzia.zOboruHodnot(96220561L));
        assertFalse("zOboruHodnot(1924411224)", Rekurzia.zOboruHodnot(1924411224L));
        assertTrue("zOboruHodnot(274738209148561921)", Rekurzia.zOboruHodnot(274738209148561921L));
        assertFalse("zOboruHodnot(5494764182971238424)", Rekurzia.zOboruHodnot(5494764182971238424L));
        assertTrue("zOboruHodnot(13)", Rekurzia.zOboruHodnot(13L));
        assertFalse("zOboruHodnot(264)", Rekurzia.zOboruHodnot(264L));
        assertTrue("zOboruHodnot(27873393043294921)", Rekurzia.zOboruHodnot(27873393043294921L));
        assertFalse("zOboruHodnot(557467860865898424)", Rekurzia.zOboruHodnot(557467860865898424L));
        assertTrue("zOboruHodnot(39490049)", Rekurzia.zOboruHodnot(39490049L));
        assertFalse("zOboruHodnot(789800984)", Rekurzia.zOboruHodnot(789800984L));
        assertTrue("zOboruHodnot(761)", Rekurzia.zOboruHodnot(761L));
        assertFalse("zOboruHodnot(15224)", Rekurzia.zOboruHodnot(15224L));
        assertTrue("zOboruHodnot(29)", Rekurzia.zOboruHodnot(29L));
        assertFalse("zOboruHodnot(584)", Rekurzia.zOboruHodnot(584L));
        assertTrue("zOboruHodnot(27298155)", Rekurzia.zOboruHodnot(27298155L));
        assertFalse("zOboruHodnot(545963104)", Rekurzia.zOboruHodnot(545963104L));
        assertTrue("zOboruHodnot(73265596607)", Rekurzia.zOboruHodnot(73265596607L));
        assertFalse("zOboruHodnot(1465311932144)", Rekurzia.zOboruHodnot(1465311932144L));
    }

}