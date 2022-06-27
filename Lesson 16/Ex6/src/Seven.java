public class Seven {
    public static SeptenaryStringFunction fun =
            (s1, s2, s3, s4, s5, s6, s7) ->
                    String.join("", s1.toUpperCase(), s2.toUpperCase(),
                            s3.toUpperCase(), s4.toUpperCase(), s5.toUpperCase(),
                            s6.toUpperCase(), s7.toUpperCase());
}