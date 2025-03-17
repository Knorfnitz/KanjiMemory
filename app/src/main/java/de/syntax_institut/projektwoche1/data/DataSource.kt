package de.syntax_institut.projektwoche1.data

import de.syntax_institut.projektwoche1.model.Example
import de.syntax_institut.projektwoche1.model.KanjiCard

object DataSource {

    val kanjiList = listOf(
        KanjiCard(
            id = 1,
            kanji = "日",
            meaning = listOf("Tag", "Sonne"),
            examples = listOf(
                Example("今日は天気がいいですね。", "Heute ist das Wetter schön."),
                Example("毎日日本語を勉強します。", "Ich lerne jeden Tag Japanisch.")
            )
        ),
        KanjiCard(
            id = 2,
            kanji = "一",
            meaning = listOf("Eins"),
            examples = listOf(
                Example("一つください。", "Geben Sie mir bitte eins."),
                Example("一月は一年の最初の月です。", "Januar ist der erste Monat des Jahres.")
            )
        ),
        KanjiCard(
            id = 3,
            kanji = "国",
            meaning = listOf("Land"),
            examples = listOf(
                Example("日本は美しい国です。", "Japan ist ein schönes Land."),
                Example("彼は外国に住んでいます。", "Er lebt im Ausland.")
            )
        ),
        KanjiCard(
            id = 4,
            kanji = "会",
            meaning = listOf("Treffen", "Versammlung"),
            examples = listOf(
                Example("友達と会いました。", "Ich habe mich mit einem Freund getroffen."),
                Example("会議が始まります。", "Das Meeting beginnt.")
            )
        ),
        KanjiCard(
            id = 5,
            kanji = "人",
            meaning = listOf("Person", "Mensch"),
            examples = listOf(
                Example("この町にはたくさんの人がいます。", "Es gibt viele Menschen in dieser Stadt."),
                Example("彼は親切な人です。", "Er ist eine freundliche Person.")
            )
        ),
        KanjiCard(
            id = 6,
            kanji = "年",
            meaning = listOf("Jahr"),
            examples = listOf(
                Example("今年は2025年です。", "Dieses Jahr ist 2025."),
                Example("来年、日本へ行きたいです。", "Nächstes Jahr möchte ich nach Japan gehen.")
            )
        ),
        KanjiCard(
            id = 7,
            kanji = "大",
            meaning = listOf("Groß"),
            examples = listOf(
                Example("この公園はとても大きいです。", "Dieser Park ist sehr groß."),
                Example("大きな夢を持っています。", "Ich habe große Träume.")
            )
        ),
        KanjiCard(
            id = 8,
            kanji = "十",
            meaning = listOf("Zehn"),
            examples = listOf(
                Example("彼は十歳です。", "Er ist zehn Jahre alt."),
                Example("十個のりんごがあります。", "Es gibt zehn Äpfel.")
            )
        ),
        KanjiCard(
            id = 9,
            kanji = "二",
            meaning = listOf("Zwei"),
            examples = listOf(
                Example("二人の子供がいます。", "Ich habe zwei Kinder."),
                Example("二つのオプションがあります。", "Es gibt zwei Optionen.")
            )
        ),
        KanjiCard(
            id = 10,
            kanji = "本",
            meaning = listOf("Buch", "Ursprung"),
            examples = listOf(
                Example("本を読みます。", "Ich lese ein Buch."),
                Example("日本の文化に興味があります。", "Ich interessiere mich für die japanische Kultur.")
            )
        ),

        KanjiCard(
            id = 11,
            kanji = "中",
            meaning = listOf("Mitte", "Inneres", "Zentrum"),
            examples = listOf(
                Example("彼は教室の中にいます。", "Er ist im Klassenzimmer."),
                Example("昼ご飯の時間は正午です。", "Die Mittagspause ist um zwölf Uhr.")
            )
        ),
        KanjiCard(
            id = 12,
            kanji = "長",
            meaning = listOf("Lang", "Anführer", "Haupt-"),
            examples = listOf(
                Example("彼女の髪はとても長いです。", "Ihre Haare sind sehr lang."),
                Example("会社の社長に会いました。", "Ich habe den Firmenchef getroffen.")
            )
        ),
        KanjiCard(
            id = 13,
            kanji = "出",
            meaning = listOf("Herausgehen", "Verlassen", "Erscheinen"),
            examples = listOf(
                Example("駅の出口はどこですか？", "Wo ist der Ausgang des Bahnhofs?"),
                Example("家を出る時間は7時です。", "Ich verlasse das Haus um 7 Uhr.")
            )
        ),
        KanjiCard(
            id = 14,
            kanji = "三",
            meaning = listOf("Drei"),
            examples = listOf(
                Example("りんごを三つ買いました。", "Ich habe drei Äpfel gekauft."),
                Example("三時に会いましょう。", "Lass uns um drei Uhr treffen.")
            )
        ),
        KanjiCard(
            id = 15,
            kanji = "同",
            meaning = listOf("Gleich", "Dasselbe"),
            examples = listOf(
                Example("私たちは同じ学校に通っています。", "Wir besuchen dieselbe Schule."),
                Example("意見が同じです。", "Unsere Meinungen sind gleich.")
            )
        ),
        KanjiCard(
            id = 16,
            kanji = "時",
            meaning = listOf("Zeit", "Stunde"),
            examples = listOf(
                Example("今は何時ですか？", "Wie spät ist es jetzt?"),
                Example("毎朝7時に起きます。", "Ich stehe jeden Morgen um 7 Uhr auf.")
            )
        ),
        KanjiCard(
            id = 17,
            kanji = "政",
            meaning = listOf("Politik", "Regierung"),
            examples = listOf(
                Example("彼は政治に興味があります。", "Er interessiert sich für Politik."),
                Example("新しい政策が発表されました。", "Eine neue politische Maßnahme wurde angekündigt.")
            )
        ),
        KanjiCard(
            id = 18,
            kanji = "事",
            meaning = listOf("Ding", "Angelegenheit", "Fakt"),
            examples = listOf(
                Example("大切な事を忘れました。", "Ich habe eine wichtige Sache vergessen."),
                Example("これは本当の事ですか？", "Ist das eine wahre Angelegenheit?")
            )
        ),
        KanjiCard(
            id = 19,
            kanji = "自",
            meaning = listOf("Selbst", "Eigenständig"),
            examples = listOf(
                Example("彼は自分で料理を作ります。", "Er kocht selbst."),
                Example("これは自動車です。", "Das ist ein Auto (selbstfahrendes Fahrzeug).")
            )
        ),
        KanjiCard(
            id = 20,
            kanji = "行",
            meaning = listOf("Gehen", "Fahren", "Handlung"),
            examples = listOf(
                Example("明日、旅行に行きます。", "Ich werde morgen auf eine Reise gehen."),
                Example("この電車は東京へ行きます。", "Dieser Zug fährt nach Tokio.")
            )
        ),
        KanjiCard(
            id = 21,
            kanji = "社",
            meaning = listOf("Firma", "Gesellschaft", "Schrein"),
            examples = listOf(
                Example("彼は大きな会社で働いています。", "Er arbeitet in einer großen Firma."),
                Example("神社でお参りしました。", "Ich habe in einem Shinto-Schrein gebetet.")
            )
        ),
        KanjiCard(
            id = 22,
            kanji = "見",
            meaning = listOf("Sehen", "Schauen"),
            examples = listOf(
                Example("テレビを見るのが好きです。", "Ich schaue gerne Fernsehen."),
                Example("昨日、新しい映画を見ました。", "Gestern habe ich einen neuen Film gesehen.")
            )
        ),
        KanjiCard(
            id = 23,
            kanji = "月",
            meaning = listOf("Monat", "Mond"),
            examples = listOf(
                Example("来月、日本に行きます。", "Nächsten Monat fahre ich nach Japan."),
                Example("月がとてもきれいですね。", "Der Mond ist heute sehr schön.")
            )
        ),
        KanjiCard(
            id = 24,
            kanji = "分",
            meaning = listOf("Minute", "Teil", "Verstehen"),
            examples = listOf(
                Example("今は10時15分です。", "Es ist jetzt 10:15 Uhr."),
                Example("この問題の意味が分かりません。", "Ich verstehe die Bedeutung dieses Problems nicht.")
            )
        ),
        KanjiCard(
            id = 25,
            kanji = "議",
            meaning = listOf("Debatte", "Beratung"),
            examples = listOf(
                Example("国会で重要な議論が行われています。", "Im Parlament findet eine wichtige Debatte statt."),
                Example("来週の会議の予定を確認してください。", "Bitte überprüfe den Zeitplan für das Meeting nächste Woche.")
            )
        ),
        KanjiCard(
            id = 26,
            kanji = "後",
            meaning = listOf("Hinter", "Später", "Danach"),
            examples = listOf(
                Example("授業の後で友達と遊びます。", "Nach dem Unterricht spiele ich mit meinen Freunden."),
                Example("後ろに何かありますか？", "Ist etwas hinter dir?")
            )
        ),
        KanjiCard(
            id = 27,
            kanji = "前",
            meaning = listOf("Vor", "Davor", "Früher"),
            examples = listOf(
                Example("学校の前に公園があります。", "Vor der Schule gibt es einen Park."),
                Example("10分前に駅に着きました。", "Ich bin vor zehn Minuten am Bahnhof angekommen.")
            )
        ),
        KanjiCard(
            id = 28,
            kanji = "民",
            meaning = listOf("Volk", "Bürger"),
            examples = listOf(
                Example("国民の意見を尊重するべきです。", "Die Meinung der Bürger sollte respektiert werden."),
                Example("日本の市民文化について勉強しています。", "Ich studiere die japanische Bürgerkultur.")
            )
        ),
        KanjiCard(
            id = 29,
            kanji = "生",
            meaning = listOf("Leben", "Geburt", "Echtheit"),
            examples = listOf(
                Example("彼は日本で生まれました。", "Er wurde in Japan geboren."),
                Example("これは生の魚です。", "Das ist roher Fisch.")
            )
        ),
        KanjiCard(
            id = 30,
            kanji = "連",
            meaning = listOf("Verbinden", "Mitnehmen"),
            examples = listOf(
                Example("彼を会議に連れて行きます。", "Ich bringe ihn mit zur Besprechung."),
                Example("この事件は他の問題と関連しています。", "Dieser Fall hängt mit anderen Problemen zusammen.")
            )
        ),
        KanjiCard(
            id = 31,
            kanji = "五",
            meaning = listOf("Fünf"),
            examples = listOf(
                Example("私の兄弟は五人います。", "Ich habe fünf Geschwister."),
                Example("五つのりんごを買いました。", "Ich habe fünf Äpfel gekauft.")
            )
        ),
        KanjiCard(
            id = 32,
            kanji = "発",
            meaning = listOf("Abfahrt", "Entwicklung", "Herausgabe"),
            examples = listOf(
                Example("新しい技術が発展しています。", "Neue Technologien entwickeln sich."),
                Example("新幹線は10時に東京を発ちます。", "Der Shinkansen fährt um 10 Uhr von Tokio ab.")
            )
        ),
        KanjiCard(
            id = 33,
            kanji = "間",
            meaning = listOf("Zwischen", "Raum", "Zeitraum"),
            examples = listOf(
                Example("テーブルの間に椅子があります。", "Zwischen den Tischen stehen Stühle."),
                Example("授業と授業の間に休憩があります。", "Zwischen den Unterrichtsstunden gibt es eine Pause.")
            )
        ),
        KanjiCard(
            id = 34,
            kanji = "対",
            meaning = listOf("Gegensatz", "Vergleich", "Gegenüber"),
            examples = listOf(
                Example("この試合はAチーム対Bチームです。", "Dieses Spiel ist Team A gegen Team B."),
                Example("問題に対する解決策を考えます。", "Ich denke über eine Lösung für das Problem nach.")
            )
        ),
        KanjiCard(
            id = 35,
            kanji = "上",
            meaning = listOf("Oben", "Über", "Hoch"),
            examples = listOf(
                Example("机の上に本があります。", "Auf dem Tisch liegt ein Buch."),
                Example("エレベーターで上に行きます。", "Ich fahre mit dem Aufzug nach oben.")
            )
        ),
        KanjiCard(
            id = 36,
            kanji = "部",
            meaning = listOf("Abteilung", "Teil"),
            examples = listOf(
                Example("私は営業部で働いています。", "Ich arbeite in der Vertriebsabteilung."),
                Example("この本の第一部を読みました。", "Ich habe den ersten Teil dieses Buches gelesen.")
            )
        ),
        KanjiCard(
            id = 37,
            kanji = "東",
            meaning = listOf("Osten"),
            examples = listOf(
                Example("東京は日本の東にあります。", "Tokio liegt im Osten Japans."),
                Example("東の空が明るくなってきた。", "Der Himmel im Osten wird heller.")
            )
        ),
        KanjiCard(
            id = 38,
            kanji = "者",
            meaning = listOf("Person", "Jemand"),
            examples = listOf(
                Example("彼は有名な作家です。", "Er ist ein berühmter Schriftsteller."),
                Example("この会社の社長はどんな人ですか？", "Wie ist der Geschäftsführer dieser Firma?")
            )
        ),
        KanjiCard(
            id = 39,
            kanji = "党",
            meaning = listOf("Partei", "Fraktion"),
            examples = listOf(
                Example("彼はその政党のリーダーです。", "Er ist der Anführer dieser politischen Partei."),
                Example("次の選挙でどの党を支持しますか？", "Welche Partei unterstützt du bei der nächsten Wahl?")
            )
        ),
        KanjiCard(
            id = 40,
            kanji = "地",
            meaning = listOf("Erde", "Boden", "Ort"),
            examples = listOf(
                Example("この土地は広いですね。", "Dieses Grundstück ist groß."),
                Example("地震の影響で建物が倒れました。", "Durch das Erdbeben sind Gebäude eingestürzt.")
            )
        ),
        KanjiCard(
            id = 41,
            kanji = "合",
            meaning = listOf("Passen", "Übereinstimmen", "Zusammenkommen"),
            examples = listOf(
                Example("彼とは気が合います。", "Ich komme gut mit ihm aus."),
                Example("二つの部分を合わせて使います。", "Wir benutzen zwei Teile zusammen.")
            )
        ),
        KanjiCard(
            id = 42,
            kanji = "市",
            meaning = listOf("Stadt", "Markt"),
            examples = listOf(
                Example("東京は日本の最大の市です。", "Tokio ist die größte Stadt Japans."),
                Example("市場で新鮮な魚を買いました。", "Ich habe auf dem Markt frischen Fisch gekauft.")
            )
        ),
        KanjiCard(
            id = 43,
            kanji = "業",
            meaning = listOf("Arbeit", "Beruf", "Industrie"),
            examples = listOf(
                Example("彼は建設業で働いています。", "Er arbeitet in der Bauindustrie."),
                Example("宿題を早く終えなさい。", "Beende deine Hausaufgaben schnell.")
            )
        ),
        KanjiCard(
            id = 44,
            kanji = "内",
            meaning = listOf("Innen", "Innerhalb", "Inneres"),
            examples = listOf(
                Example("部屋の内はとても静かです。", "Im Zimmer ist es sehr ruhig."),
                Example("社内で会議があります。", "Es gibt ein Meeting innerhalb der Firma.")
            )
        ),
        KanjiCard(
            id = 45,
            kanji = "相",
            meaning = listOf("Gegenseitig", "Minister"),
            examples = listOf(
                Example("彼とは相性がいいです。", "Ich habe eine gute Chemie mit ihm."),
                Example("日本の首相は岸田文雄です。", "Der Premierminister Japans ist Fumio Kishida.")
            )
        ),
        KanjiCard(
            id = 46,
            kanji = "方",
            meaning = listOf("Richtung", "Person", "Methode"),
            examples = listOf(
                Example("右の方を見てください。", "Bitte schauen Sie nach rechts."),
                Example("この問題の解決方法を教えてください。", "Bitte erklären Sie mir die Lösung für dieses Problem.")
            )
        ),
        KanjiCard(
            id = 47,
            kanji = "四",
            meaning = listOf("Vier"),
            examples = listOf(
                Example("四月に桜が咲きます。", "Im April blühen die Kirschbäume."),
                Example("テーブルの上に四つの皿があります。", "Es sind vier Teller auf dem Tisch.")
            )
        ),
        KanjiCard(
            id = 48,
            kanji = "定",
            meaning = listOf("Bestimmen", "Festlegen"),
            examples = listOf(
                Example("会議の日時を決定しました。", "Das Datum und die Uhrzeit des Meetings wurden festgelegt."),
                Example("ルールを守ることは大切です。", "Es ist wichtig, sich an die Regeln zu halten.")
            )
        ),
        KanjiCard(
            id = 49,
            kanji = "今",
            meaning = listOf("Jetzt", "Gegenwart"),
            examples = listOf(
                Example("今、何時ですか？", "Wie spät ist es jetzt?"),
                Example("今週は忙しいです。", "Diese Woche bin ich beschäftigt.")
            )
        ),
        KanjiCard(
            id = 50,
            kanji = "回",
            meaning = listOf("Mal", "Runde", "Drehen"),
            examples = listOf(
                Example("この映画を三回見ました。", "Ich habe diesen Film dreimal gesehen."),
                Example("彼はボールを回しました。", "Er hat den Ball gedreht.")
            )
        ),
        KanjiCard(
            id = 51,
            kanji = "新",
            meaning = listOf("Neu"),
            examples = listOf(
                Example("新しい本を買いました。", "Ich habe ein neues Buch gekauft."),
                Example("新年おめでとうございます。", "Frohes neues Jahr.")
            )
        ),
        KanjiCard(
            id = 52,
            kanji = "場",
            meaning = listOf("Ort", "Platz"),
            examples = listOf(
                Example("会場はどこですか？", "Wo ist der Veranstaltungsort?"),
                Example("公園は子供たちの遊び場です。", "Der Park ist ein Spielplatz für Kinder.")
            )
        ),
        KanjiCard(
            id = 53,
            kanji = "金",
            meaning = listOf("Gold", "Geld"),
            examples = listOf(
                Example("銀行でお金をおろしました。", "Ich habe Geld von der Bank abgehoben."),
                Example("金曜日は映画を見に行きます。", "Am Freitag gehe ich ins Kino.")
            )
        ),
        KanjiCard(
            id = 54,
            kanji = "員",
            meaning = listOf("Mitglied", "Personal"),
            examples = listOf(
                Example("会社の社員です。", "Ich bin ein Mitarbeiter der Firma."),
                Example("店員に質問しました。", "Ich habe den Verkäufer gefragt.")
            )
        ),
        KanjiCard(
            id = 55,
            kanji = "九",
            meaning = listOf("Neun"),
            examples = listOf(
                Example("私は九月に生まれました。", "Ich wurde im September geboren."),
                Example("猫が九匹います。", "Es gibt neun Katzen.")
            )
        ),
        KanjiCard(
            id = 56,
            kanji = "入",
            meaning = listOf("Betreten", "Hineingehen"),
            examples = listOf(
                Example("ドアから入ってください。", "Bitte treten Sie durch die Tür ein."),
                Example("お風呂に入るのが好きです。", "Ich bade gerne.")
            )
        ),
        KanjiCard(
            id = 57,
            kanji = "選",
            meaning = listOf("Wählen", "Auswählen"),
            examples = listOf(
                Example("好きな色を選んでください。", "Bitte wählen Sie Ihre Lieblingsfarbe aus."),
                Example("選挙に参加しました。", "Ich habe an der Wahl teilgenommen.")
            )
        ),
        KanjiCard(
            id = 58,
            kanji = "立",
            meaning = listOf("Stehen", "Errichten"),
            examples = listOf(
                Example("駅の前に大きなビルが立っています。", "Vor dem Bahnhof steht ein großes Gebäude."),
                Example("先生が教室に立っています。", "Der Lehrer steht im Klassenzimmer.")
            )
        ),
        KanjiCard(
            id = 59,
            kanji = "開",
            meaning = listOf("Öffnen"),
            examples = listOf(
                Example("窓を開けてください。", "Bitte öffne das Fenster."),
                Example("新しい店が開店しました。", "Ein neues Geschäft hat eröffnet.")
            )
        ),
        KanjiCard(
            id = 60,
            kanji = "手",
            meaning = listOf("Hand"),
            examples = listOf(
                Example("右手をあげてください。", "Bitte heben Sie die rechte Hand."),
                Example("彼は手を洗いました。", "Er hat sich die Hände gewaschen.")
            )
        ),
        KanjiCard(
            id = 61,
            kanji = "米",
            meaning = listOf("Reis", "Amerika"),
            examples = listOf(
                Example("毎日ご飯を食べます。", "Ich esse jeden Tag Reis."),
                Example("彼はアメリカに住んでいます。", "Er lebt in Amerika.")
            )
        ),
        KanjiCard(
            id = 62,
            kanji = "力",
            meaning = listOf("Kraft", "Stärke"),
            examples = listOf(
                Example("彼は力が強いです。", "Er ist sehr stark."),
                Example("勉強する力が必要です。", "Man braucht die Kraft zum Lernen.")
            )
        ),
        KanjiCard(
            id = 63,
            kanji = "学",
            meaning = listOf("Lernen", "Wissenschaft"),
            examples = listOf(
                Example("大学で日本語を学びます。", "Ich lerne Japanisch an der Universität."),
                Example("科学はとても面白いです。", "Wissenschaft ist sehr interessant.")
            )
        ),
        KanjiCard(
            id = 64,
            kanji = "問",
            meaning = listOf("Frage", "Befragen"),
            examples = listOf(
                Example("先生に質問しました。", "Ich habe den Lehrer eine Frage gestellt."),
                Example("問題を解きましょう。", "Lass uns die Aufgabe lösen.")
            )
        ),
        KanjiCard(
            id = 65,
            kanji = "高",
            meaning = listOf("Hoch", "Teuer"),
            examples = listOf(
                Example("この建物はとても高いです。", "Dieses Gebäude ist sehr hoch."),
                Example("この靴は高すぎます。", "Diese Schuhe sind zu teuer.")
            )
        ),
        KanjiCard(
            id = 66,
            kanji = "代",
            meaning = listOf("Zeitalter", "Ersetzen"),
            examples = listOf(
                Example("これは新しい時代です。", "Das ist ein neues Zeitalter."),
                Example("友達の代わりに行きました。", "Ich bin anstelle meines Freundes gegangen.")
            )
        ),
        KanjiCard(
            id = 67,
            kanji = "明",
            meaning = listOf("Hell", "Klar"),
            examples = listOf(
                Example("明るい部屋が好きです。", "Ich mag helle Räume."),
                Example("明日は晴れるでしょう。", "Morgen wird es wahrscheinlich sonnig sein.")
            )
        ),
        KanjiCard(
            id = 68,
            kanji = "実",
            meaning = listOf("Wahrheit", "Realität"),
            examples = listOf(
                Example("これは実話です。", "Das ist eine wahre Geschichte."),
                Example("彼の話は実に面白いです。", "Seine Geschichte ist wirklich interessant.")
            )
        ),
        KanjiCard(
            id = 69,
            kanji = "円",
            meaning = listOf("Yen", "Kreis"),
            examples = listOf(
                Example("これは100円です。", "Das kostet 100 Yen."),
                Example("円を描いてください。", "Bitte zeichne einen Kreis.")
            )
        ),
        KanjiCard(
            id = 70,
            kanji = "関",
            meaning = listOf("Beziehung", "Verbindung"),
            examples = listOf(
                Example("私はその事件に関係がありません。", "Ich habe nichts mit diesem Vorfall zu tun."),
                Example("これは日本の文化と関係があります。", "Das hat mit der japanischen Kultur zu tun.")
            )
        ),
        KanjiCard(
            id = 71,
            kanji = "決",
            meaning = listOf("Entscheidung", "Bestimmen"),
            examples = listOf(
                Example("来週の予定を決めましょう。", "Lass uns den Plan für nächste Woche festlegen."),
                Example("彼は自分で決めた。", "Er hat selbst entschieden.")
            )
        ),
        KanjiCard(
            id = 72,
            kanji = "子",
            meaning = listOf("Kind", "Nachkomme"),
            examples = listOf(
                Example("この子はとても元気です。", "Dieses Kind ist sehr energiegeladen."),
                Example("子供のころの夢を思い出した。", "Ich erinnerte mich an meine Kindheitsträume.")
            )
        ),
        KanjiCard(
            id = 73,
            kanji = "動",
            meaning = listOf("Bewegen", "Bewegung"),
            examples = listOf(
                Example("この車は動きません。", "Dieses Auto bewegt sich nicht."),
                Example("動物が好きです。", "Ich mag Tiere.")
            )
        ),
        KanjiCard(
            id = 74,
            kanji = "京",
            meaning = listOf("Hauptstadt"),
            examples = listOf(
                Example("京都に行ったことがありますか？", "Warst du schon einmal in Kyoto?"),
                Example("東京は日本の首都です。", "Tokio ist die Hauptstadt Japans.")
            )
        ),
        KanjiCard(
            id = 75,
            kanji = "全",
            meaning = listOf("Ganz", "Gesamtheit"),
            examples = listOf(
                Example("全ての人が参加しました。", "Alle Leute haben teilgenommen."),
                Example("この映画は全然面白くなかった。", "Dieser Film war überhaupt nicht interessant.")
            )
        ),
        KanjiCard(
            id = 76,
            kanji = "目",
            meaning = listOf("Auge", "Blick"),
            examples = listOf(
                Example("目が痛いです。", "Meine Augen tun weh."),
                Example("彼の目を見て話してください。", "Bitte sprich, während du ihm in die Augen schaust.")
            )
        ),
        KanjiCard(
            id = 77,
            kanji = "表",
            meaning = listOf("Oberfläche", "Tabelle"),
            examples = listOf(
                Example("この表を見てください。", "Bitte schau dir diese Tabelle an."),
                Example("彼の気持ちは表に出ていた。", "Seine Gefühle waren offen sichtbar.")
            )
        ),
        KanjiCard(
            id = 78,
            kanji = "戦",
            meaning = listOf("Krieg", "Kampf"),
            examples = listOf(
                Example("第二次世界大戦について勉強しています。", "Ich lerne über den Zweiten Weltkrieg."),
                Example("戦いは終わった。", "Der Kampf ist vorbei.")
            )
        ),
        KanjiCard(
            id = 79,
            kanji = "経",
            meaning = listOf("Vergangene Zeit", "Wirtschaft"),
            examples = listOf(
                Example("時間が経ちました。", "Die Zeit ist vergangen."),
                Example("彼は経済を勉強しています。", "Er studiert Wirtschaft.")
            )
        ),
        KanjiCard(
            id = 80,
            kanji = "通",
            meaning = listOf("Durchqueren", "Verkehr"),
            examples = listOf(
                Example("毎日この道を通ります。", "Ich gehe jeden Tag diesen Weg entlang."),
                Example("電車で通勤しています。", "Ich pendle mit dem Zug zur Arbeit.")
            )
        ),
        KanjiCard(
            id = 81,
            kanji = "外",
            meaning = listOf("Außen", "Draußen"),
            examples = listOf(
                Example("今日は外で遊びましょう。", "Lass uns heute draußen spielen."),
                Example("彼は外国で働いています。", "Er arbeitet im Ausland.")
            )
        ),
        KanjiCard(
            id = 82,
            kanji = "最",
            meaning = listOf("Das Beste", "Am meisten"),
            examples = listOf(
                Example("これは私の最も好きな映画です。", "Das ist mein Lieblingsfilm."),
                Example("彼は最初に到着しました。", "Er kam als Erster an.")
            )
        ),
        KanjiCard(
            id = 83,
            kanji = "言",
            meaning = listOf("Sagen", "Wort"),
            examples = listOf(
                Example("何か言いたいことがありますか？", "Hast du etwas zu sagen?"),
                Example("彼の言葉はとても感動的でした。", "Seine Worte waren sehr bewegend.")
            )
        ),
        KanjiCard(
            id = 84,
            kanji = "氏",
            meaning = listOf("Familienname", "Clan"),
            examples = listOf(
                Example("田中氏に会いましたか？", "Hast du Herrn Tanaka getroffen?"),
                Example("彼は有名な氏族の出身です。", "Er stammt aus einer berühmten Familie.")
            )
        ),
        KanjiCard(
            id = 85,
            kanji = "現",
            meaning = listOf("Erscheinen", "Gegenwart"),
            examples = listOf(
                Example("彼は現場にいませんでした。", "Er war nicht am Tatort."),
                Example("現在の状況を教えてください。", "Bitte erzähle mir die aktuelle Situation.")
            )
        ),
        KanjiCard(
            id = 86,
            kanji = "理",
            meaning = listOf("Logik", "Grund"),
            examples = listOf(
                Example("物理学は面白いです。", "Physik ist interessant."),
                Example("彼の説明には理屈がある。", "Seine Erklärung macht Sinn.")
            )
        ),
        KanjiCard(
            id = 87,
            kanji = "調",
            meaning = listOf("Untersuchen", "Anpassen"),
            examples = listOf(
                Example("この問題を調べてみましょう。", "Lass uns dieses Problem untersuchen."),
                Example("音を調節してください。", "Bitte stelle den Ton ein.")
            )
        ),
        KanjiCard(
            id = 88,
            kanji = "体",
            meaning = listOf("Körper", "Form"),
            examples = listOf(
                Example("彼は体が丈夫です。", "Er hat einen starken Körper."),
                Example("運動は体に良いです。", "Sport ist gut für den Körper.")
            )
        ),
        KanjiCard(
            id = 89,
            kanji = "化",
            meaning = listOf("Verwandlung", "Kultur"),
            examples = listOf(
                Example("この町は近年大きく変化しました。", "Diese Stadt hat sich in den letzten Jahren stark verändert."),
                Example("日本文化に興味があります。", "Ich interessiere mich für die japanische Kultur.")
            )
        ),
        KanjiCard(
            id = 90,
            kanji = "田",
            meaning = listOf("Reisfeld"),
            examples = listOf(
                Example("彼の家の近くに田んぼがあります。", "In der Nähe seines Hauses gibt es ein Reisfeld."),
                Example("田舎に住みたいです。", "Ich möchte auf dem Land leben.")
            )
        ),
        KanjiCard(
            id = 91,
            kanji = "当",
            meaning = listOf("Treffen", "Zutreffen"),
            examples = listOf(
                Example("この答えは正解に当たります。", "Diese Antwort ist richtig."),
                Example("彼の予想が当たった。", "Seine Vorhersage traf zu.")
            )
        ),
        KanjiCard(
            id = 92,
            kanji = "八",
            meaning = listOf("Acht"),
            examples = listOf(
                Example("彼には八人の兄弟がいます。", "Er hat acht Geschwister."),
                Example("八月は暑いですね。", "Der August ist heiß.")
            )
        ),
        KanjiCard(
            id = 93,
            kanji = "六",
            meaning = listOf("Sechs"),
            examples = listOf(
                Example("私は六時に起きます。", "Ich stehe um sechs Uhr auf."),
                Example("六個のリンゴを買いました。", "Ich habe sechs Äpfel gekauft.")
            )
        ),
        KanjiCard(
            id = 94,
            kanji = "約",
            meaning = listOf("Ungefähr", "Versprechen"),
            examples = listOf(
                Example("約束を守ってください。", "Bitte halte dein Versprechen."),
                Example("約三時間かかります。", "Es dauert ungefähr drei Stunden.")
            )
        ),
        KanjiCard(
            id = 95,
            kanji = "主",
            meaning = listOf("Haupt-", "Meister"),
            examples = listOf(
                Example("彼は主なメンバーです。", "Er ist ein Hauptmitglied."),
                Example("主に日本語を勉強しています。", "Ich lerne hauptsächlich Japanisch.")
            )
        ),
        KanjiCard(
            id = 96,
            kanji = "題",
            meaning = listOf("Thema", "Titel"),
            examples = listOf(
                Example("この本の題名は何ですか？", "Wie lautet der Titel dieses Buches?"),
                Example("次の議題に移りましょう。", "Lass uns zum nächsten Thema übergehen.")
            )
        ),
        KanjiCard(
            id = 97,
            kanji = "下",
            meaning = listOf("Unten", "Unter"),
            examples = listOf(
                Example("机の下に猫がいます。", "Unter dem Tisch ist eine Katze."),
                Example("川の水が下がる。", "Der Wasserspiegel des Flusses sinkt.")
            )
        ),
        KanjiCard(
            id = 98,
            kanji = "首",
            meaning = listOf("Hals", "Kopf"),
            examples = listOf(
                Example("首を動かしてください。", "Bitte bewege deinen Hals."),
                Example("首都はどこですか？", "Wo ist die Hauptstadt?")
            )
        ),
        KanjiCard(
            id = 99,
            kanji = "意",
            meaning = listOf("Gedanke", "Bedeutung"),
            examples = listOf(
                Example("彼の意見に賛成です。", "Ich stimme seiner Meinung zu."),
                Example("その言葉の意味は何ですか？", "Was bedeutet dieses Wort?")
            )
        ),
        KanjiCard(
            id = 100,
            kanji = "法",
            meaning = listOf("Gesetz", "Methode"),
            examples = listOf(
                Example("新しい法律が施行されます。", "Ein neues Gesetz tritt in Kraft."),
                Example("効果的な学習方法を知りたい。", "Ich möchte eine effektive Lernmethode wissen.")
            )
        ),
        KanjiCard(
            id = 101,
            kanji = "不",
            meaning = listOf("Nicht", "Un-"),
            examples = listOf(
                Example("彼の態度は不安です。", "Sein Verhalten ist beunruhigend."),
                Example("この計画は不可能だ。", "Dieser Plan ist unmöglich.")
            )
        ),
        KanjiCard(
            id = 102,
            kanji = "来",
            meaning = listOf("Kommen", "Nächste"),
            examples = listOf(
                Example("明日、友達が来ます。", "Morgen kommt mein Freund."),
                Example("来週はテストがあります。", "Nächste Woche gibt es einen Test.")
            )
        ),
        KanjiCard(
            id = 103,
            kanji = "作",
            meaning = listOf("Machen", "Produzieren"),
            examples = listOf(
                Example("彼は映画を作っています。", "Er macht einen Film."),
                Example("新しい計画を作る。", "Einen neuen Plan erstellen.")
            )
        ),
        KanjiCard(
            id = 104,
            kanji = "性",
            meaning = listOf("Geschlecht", "Natur"),
            examples = listOf(
                Example("男性と女性がいます。", "Es gibt Männer und Frauen."),
                Example("水には液体の性質があります。", "Wasser hat die Eigenschaft einer Flüssigkeit.")
            )
        ),
        KanjiCard(
            id = 105,
            kanji = "的",
            meaning = listOf("Ziel", "Adjektivendung"),
            examples = listOf(
                Example("これは文化的な問題です。", "Das ist ein kulturelles Problem."),
                Example("科学的な研究を行う。", "Wissenschaftliche Forschung betreiben.")
            )
        ),
        KanjiCard(
            id = 106,
            kanji = "要",
            meaning = listOf("Benötigen", "Wichtig"),
            examples = listOf(
                Example("これは重要な情報です。", "Das ist wichtige Information."),
                Example("成功には努力が必要だ。", "Für Erfolg ist Anstrengung notwendig.")
            )
        ),
        KanjiCard(
            id = 107,
            kanji = "用",
            meaning = listOf("Benutzung", "Nutzen"),
            examples = listOf(
                Example("辞書を用いて単語を調べる。", "Ein Wörterbuch benutzen, um Wörter nachzuschlagen."),
                Example("彼には特別な用途がある。", "Er hat eine besondere Verwendung.")
            )
        ),
        KanjiCard(
            id = 108,
            kanji = "制",
            meaning = listOf("System", "Regel"),
            examples = listOf(
                Example("この国の教育制度は優れている。", "Das Bildungssystem dieses Landes ist hervorragend."),
                Example("新しい法律が制定された。", "Ein neues Gesetz wurde verabschiedet.")
            )
        ),
        KanjiCard(
            id = 109,
            kanji = "治",
            meaning = listOf("Regieren", "Heilen"),
            examples = listOf(
                Example("彼は国を治める。", "Er regiert das Land."),
                Example("風邪が治りました。", "Meine Erkältung ist geheilt.")
            )
        ),
        KanjiCard(
            id = 110,
            kanji = "度",
            meaning = listOf("Mal", "Grad"),
            examples = listOf(
                Example("もう一度言ってください。", "Bitte sag es noch einmal."),
                Example("今日は気温が30度です。", "Heute beträgt die Temperatur 30 Grad.")
            )
        ),
        KanjiCard(
            id = 111,
            kanji = "務",
            meaning = listOf("Aufgabe", "Pflicht"),
            examples = listOf(
                Example("彼は会社で重要な務めを果たしている。", "Er erfüllt eine wichtige Aufgabe in der Firma."),
                Example("市民の務めを果たす。", "Die Pflichten eines Bürgers erfüllen.")
            )
        ),
        KanjiCard(
            id = 112,
            kanji = "強",
            meaning = listOf("Stark", "Kräftig"),
            examples = listOf(
                Example("彼はとても強い。", "Er ist sehr stark."),
                Example("風が強く吹いている。", "Der Wind weht stark.")
            )
        ),
        KanjiCard(
            id = 113,
            kanji = "気",
            meaning = listOf("Geist", "Stimmung"),
            examples = listOf(
                Example("今日は気分がいい。", "Ich fühle mich heute gut."),
                Example("彼は気が強い。", "Er hat einen starken Willen.")
            )
        ),
        KanjiCard(
            id = 114,
            kanji = "小",
            meaning = listOf("Klein"),
            examples = listOf(
                Example("この町はとても小さい。", "Diese Stadt ist sehr klein."),
                Example("小さな子供が遊んでいる。", "Ein kleines Kind spielt.")
            )
        ),
        KanjiCard(
            id = 115,
            kanji = "七",
            meaning = listOf("Sieben"),
            examples = listOf(
                Example("私は七時に起きます。", "Ich stehe um sieben Uhr auf."),
                Example("彼は七歳です。", "Er ist sieben Jahre alt.")
            )
        ),
        KanjiCard(
            id = 116,
            kanji = "成",
            meaning = listOf("Werden", "Erreichen"),
            examples = listOf(
                Example("彼は医者になりました。", "Er ist Arzt geworden."),
                Example("努力が成功につながる。", "Anstrengung führt zum Erfolg.")
            )
        ),
        KanjiCard(
            id = 117,
            kanji = "期",
            meaning = listOf("Periode", "Zeitabschnitt"),
            examples = listOf(
                Example("試験の期間が始まる。", "Die Prüfungszeit beginnt."),
                Example("彼は長期的な計画を立てた。", "Er hat einen langfristigen Plan gemacht.")
            )
        ),
        KanjiCard(
            id = 118,
            kanji = "公",
            meaning = listOf("Öffentlich"),
            examples = listOf(
                Example("この公園は広い。", "Dieser Park ist groß."),
                Example("公の場で発言する。", "In der Öffentlichkeit sprechen.")
            )
        ),
        KanjiCard(
            id = 119,
            kanji = "持",
            meaning = listOf("Halten", "Besitzen"),
            examples = listOf(
                Example("彼は新しい車を持っている。", "Er besitzt ein neues Auto."),
                Example("このカバンを持ってください。", "Bitte halte diese Tasche.")
            )
        ),
        KanjiCard(
            id = 120,
            kanji = "野",
            meaning = listOf("Feld", "Natur"),
            examples = listOf(
                Example("私は野菜が好きです。", "Ich mag Gemüse."),
                Example("広い野原が見える。", "Man sieht eine weite Wiese.")
            )
        ),
        KanjiCard(
            id = 121,
            kanji = "協",
            meaning = listOf("Zusammenarbeit", "Kooperation"),
            examples = listOf(
                Example("チームワークには協力が必要です。", "Für Teamarbeit ist Kooperation notwendig."),
                Example("みんなで協力して掃除をした。", "Alle haben zusammengearbeitet, um sauber zu machen.")
            )
        ),
        KanjiCard(
            id = 122,
            kanji = "取",
            meaning = listOf("Nehmen", "Erhalten"),
            examples = listOf(
                Example("彼は新しい資格を取った。", "Er hat eine neue Qualifikation erworben."),
                Example("予約を取りました。", "Ich habe eine Reservierung gemacht.")
            )
        ),
        KanjiCard(
            id = 123,
            kanji = "都",
            meaning = listOf("Metropole", "Hauptstadt"),
            examples = listOf(
                Example("東京は日本の都です。", "Tokio ist die Hauptstadt Japans."),
                Example("都会の生活は忙しい。", "Das Stadtleben ist hektisch.")
            )
        ),
        KanjiCard(
            id = 124,
            kanji = "和",
            meaning = listOf("Harmonie", "Japanisch"),
            examples = listOf(
                Example("この部屋は和風のデザインです。", "Dieses Zimmer hat ein japanisches Design."),
                Example("和を大切にする。", "Harmonie ist wichtig.")
            )
        ),
        KanjiCard(
            id = 125,
            kanji = "統",
            meaning = listOf("Vereinigung", "Regierung"),
            examples = listOf(
                Example("国を統治する。", "Ein Land regieren."),
                Example("会社の統合が決まった。", "Die Fusion der Firmen wurde beschlossen.")
            )
        ),
        KanjiCard(
            id = 126,
            kanji = "以",
            meaning = listOf("Mit", "Ab"),
            examples = listOf(
                Example("これ以外に方法はない。", "Es gibt keine andere Möglichkeit."),
                Example("午後3時以降に来てください。", "Bitte komme nach 15 Uhr.")
            )
        ),
        KanjiCard(
            id = 127,
            kanji = "機",
            meaning = listOf("Maschine", "Gelegenheit"),
            examples = listOf(
                Example("この機械はとても便利です。", "Diese Maschine ist sehr praktisch."),
                Example("良い機会を逃した。", "Ich habe eine gute Gelegenheit verpasst.")
            )
        ),
        KanjiCard(
            id = 128,
            kanji = "平",
            meaning = listOf("Flach", "Frieden"),
            examples = listOf(
                Example("この道は平らです。", "Diese Straße ist flach."),
                Example("世界平和を願う。", "Ich wünsche mir Weltfrieden.")
            )
        ),
        KanjiCard(
            id = 129,
            kanji = "総",
            meaning = listOf("Gesamt", "Insgesamt"),
            examples = listOf(
                Example("総人口は1億人を超える。", "Die Gesamtbevölkerung übersteigt 100 Millionen."),
                Example("総理大臣はスピーチをした。", "Der Premierminister hielt eine Rede.")
            )
        ),
        KanjiCard(
            id = 130,
            kanji = "加",
            meaning = listOf("Hinzufügen", "Teilnehmen"),
            examples = listOf(
                Example("彼はチームに加わった。", "Er ist dem Team beigetreten."),
                Example("砂糖を少し加えてください。", "Bitte füge etwas Zucker hinzu.")
            )
        ),
        KanjiCard(
            id = 131,
            kanji = "山",
            meaning = listOf("Berg", "Gebirge"),
            examples = listOf(
                Example("富士山は日本で一番高い山です。", "Der Mount Fuji ist der höchste Berg in Japan."),
                Example("週末に山登りをします。", "Am Wochenende gehe ich wandern.")
            )
        ),
        KanjiCard(
            id = 132,
            kanji = "思",
            meaning = listOf("Denken", "Überlegen"),
            examples = listOf(
                Example("彼のことを思い出す。", "Ich erinnere mich an ihn."),
                Example("いい考えを思いついた。", "Mir ist eine gute Idee eingefallen.")
            )
        ),
        KanjiCard(
            id = 133,
            kanji = "家",
            meaning = listOf("Haus", "Familie"),
            examples = listOf(
                Example("私の家は駅の近くです。", "Mein Haus ist in der Nähe des Bahnhofs."),
                Example("家族と一緒に旅行する。", "Ich reise mit meiner Familie.")
            )
        ),
        KanjiCard(
            id = 134,
            kanji = "話",
            meaning = listOf("Gespräch", "Geschichte"),
            examples = listOf(
                Example("友達と話をする。", "Ich unterhalte mich mit einem Freund."),
                Example("面白い話を聞いた。", "Ich habe eine interessante Geschichte gehört.")
            )
        ),
        KanjiCard(
            id = 135,
            kanji = "世",
            meaning = listOf("Welt", "Gesellschaft"),
            examples = listOf(
                Example("世界中を旅行したい。", "Ich möchte um die ganze Welt reisen."),
                Example("世の中は変わっていく。", "Die Welt verändert sich.")
            )
        ),
        KanjiCard(
            id = 136,
            kanji = "受",
            meaning = listOf("Empfangen", "Bestehen (Prüfung)"),
            examples = listOf(
                Example("メールを受け取りました。", "Ich habe die E-Mail erhalten."),
                Example("試験を受ける。", "Ich nehme an der Prüfung teil.")
            )
        ),
        KanjiCard(
            id = 137,
            kanji = "区",
            meaning = listOf("Bezirk", "Stadtteil"),
            examples = listOf(
                Example("東京都には23の区がある。", "Tokio hat 23 Bezirke."),
                Example("この区は静かです。", "Dieser Stadtteil ist ruhig.")
            )
        ),
        KanjiCard(
            id = 138,
            kanji = "領",
            meaning = listOf("Gebiet", "Territorium"),
            examples = listOf(
                Example("この島は日本の領土です。", "Diese Insel ist japanisches Territorium."),
                Example("彼は広い領域で活躍している。", "Er ist in einem weiten Bereich tätig.")
            )
        ),
        KanjiCard(
            id = 139,
            kanji = "多",
            meaning = listOf("Viele", "Häufig"),
            examples = listOf(
                Example("日本には多くの観光地がある。", "Japan hat viele Sehenswürdigkeiten."),
                Example("多くの人がそのイベントに参加した。", "Viele Menschen nahmen an der Veranstaltung teil.")
            )
        ),
        KanjiCard(
            id = 140,
            kanji = "県",
            meaning = listOf("Präfektur"),
            examples = listOf(
                Example("大阪府と京都府は近い。", "Die Präfekturen Osaka und Kyoto liegen nahe beieinander."),
                Example("この県は美しい自然が多い。", "Diese Präfektur hat viel schöne Natur.")
            )
        ),
        KanjiCard(
            id = 141,
            kanji = "続",
            meaning = listOf("Fortsetzen", "Andauern"),
            examples = listOf(
                Example("彼の話は続いている。", "Seine Geschichte geht weiter."),
                Example("このドラマの続きが気になる。", "Ich bin gespannt auf die Fortsetzung dieses Dramas.")
            )
        ),
        KanjiCard(
            id = 142,
            kanji = "進",
            meaning = listOf("Vorrücken", "Fortschreiten"),
            examples = listOf(
                Example("科学技術は急速に進んでいる。", "Die Technologie schreitet rasant voran."),
                Example("前に進んでください。", "Bitte gehen Sie nach vorne.")
            )
        ),
        KanjiCard(
            id = 143,
            kanji = "正",
            meaning = listOf("Richtig", "Gerecht"),
            examples = listOf(
                Example("正しい答えを選んでください。", "Bitte wählen Sie die richtige Antwort."),
                Example("彼は正直な人です。", "Er ist eine ehrliche Person.")
            )
        ),
        KanjiCard(
            id = 144,
            kanji = "安",
            meaning = listOf("Sicher", "Günstig"),
            examples = listOf(
                Example("この店は安いです。", "Dieses Geschäft ist günstig."),
                Example("ここは安全な場所です。", "Dies ist ein sicherer Ort.")
            )
        ),
        KanjiCard(
            id = 145,
            kanji = "設",
            meaning = listOf("Einrichten", "Gründen"),
            examples = listOf(
                Example("新しい会社を設立しました。", "Ein neues Unternehmen wurde gegründet."),
                Example("この施設は最新技術を使っています。", "Diese Einrichtung verwendet die neueste Technologie.")
            )
        ),
        KanjiCard(
            id = 146,
            kanji = "保",
            meaning = listOf("Schützen", "Bewahren"),
            examples = listOf(
                Example("健康を保つことが大切です。", "Es ist wichtig, die Gesundheit zu erhalten."),
                Example("環境を保護するために努力しましょう。", "Lassen Sie uns Anstrengungen unternehmen, um die Umwelt zu schützen.")
            )
        ),
        KanjiCard(
            id = 147,
            kanji = "改",
            meaning = listOf("Ändern", "Verbessern"),
            examples = listOf(
                Example("計画を改める必要がある。", "Der Plan muss überarbeitet werden."),
                Example("彼は生活習慣を改めた。", "Er hat seine Lebensgewohnheiten geändert.")
            )
        ),
        KanjiCard(
            id = 148,
            kanji = "数",
            meaning = listOf("Zahl", "Menge"),
            examples = listOf(
                Example("数を数えるのが好きです。", "Ich zähle gerne Zahlen."),
                Example("学生の数が増えています。", "Die Zahl der Studenten nimmt zu.")
            )
        ),
        KanjiCard(
            id = 149,
            kanji = "記",
            meaning = listOf("Aufzeichnen", "Notieren"),
            examples = listOf(
                Example("日記を書いています。", "Ich schreibe ein Tagebuch."),
                Example("この情報を記録してください。", "Bitte notieren Sie diese Information.")
            )
        ),
        KanjiCard(
            id = 150,
            kanji = "院",
            meaning = listOf("Institut", "Einrichtung"),
            examples = listOf(
                Example("彼は大学院に進学しました。", "Er ist in die Graduiertenschule gegangen."),
                Example("病院で診察を受けました。", "Ich wurde im Krankenhaus untersucht.")
            )
        ),
        KanjiCard(
            id = 151,
            kanji = "女",
            meaning = listOf("Frau", "Weiblich"),
            examples = listOf(
                Example("彼女はとても優しい。", "Sie ist sehr freundlich."),
                Example("この学校は女子が多い。", "Diese Schule hat viele Mädchen.")
            )
        ),
        KanjiCard(
            id = 152,
            kanji = "初",
            meaning = listOf("Anfang", "Erstes Mal"),
            examples = listOf(
                Example("初めて日本に行きました。", "Ich bin zum ersten Mal nach Japan gereist."),
                Example("彼の初恋の話を聞いた。", "Ich habe seine erste Liebesgeschichte gehört.")
            )
        ),
        KanjiCard(
            id = 153,
            kanji = "北",
            meaning = listOf("Norden"),
            examples = listOf(
                Example("北海道は寒いです。", "Hokkaido ist kalt."),
                Example("北風が強いですね。", "Der Nordwind ist stark.")
            )
        ),
        KanjiCard(
            id = 154,
            kanji = "午",
            meaning = listOf("Mittag"),
            examples = listOf(
                Example("午後に会いましょう。", "Lass uns am Nachmittag treffen."),
                Example("正午に昼ご飯を食べます。", "Ich esse um zwölf Uhr Mittagessen.")
            )
        ),
        KanjiCard(
            id = 155,
            kanji = "指",
            meaning = listOf("Finger", "Zeigen"),
            examples = listOf(
                Example("指を怪我しました。", "Ich habe mir den Finger verletzt."),
                Example("あの看板を指さしてください。", "Bitte zeigen Sie auf dieses Schild.")
            )
        ),
        KanjiCard(
            id = 156,
            kanji = "権",
            meaning = listOf("Macht", "Recht"),
            examples = listOf(
                Example("彼には特別な権利がある。", "Er hat besondere Rechte."),
                Example("投票権を持っていますか？", "Haben Sie ein Wahlrecht?")
            )
        ),
        KanjiCard(
            id = 157,
            kanji = "心",
            meaning = listOf("Herz", "Geist"),
            examples = listOf(
                Example("彼は優しい心を持っている。", "Er hat ein freundliches Herz."),
                Example("心を開いて話してください。", "Bitte sprich offen mit mir.")
            )
        ),
        KanjiCard(
            id = 158,
            kanji = "界",
            meaning = listOf("Welt", "Bereich"),
            examples = listOf(
                Example("科学の世界は広い。", "Die Welt der Wissenschaft ist groß."),
                Example("芸術界で有名な人です。", "Er ist in der Kunstwelt berühmt.")
            )
        ),
        KanjiCard(
            id = 159,
            kanji = "支",
            meaning = listOf("Unterstützen", "Zweig"),
            examples = listOf(
                Example("家族を支えています。", "Ich unterstütze meine Familie."),
                Example("この会社は多くの支店があります。", "Diese Firma hat viele Zweigstellen.")
            )
        ),
        KanjiCard(
            id = 160,
            kanji = "第",
            meaning = listOf("Nummer", "Rang"),
            examples = listOf(
                Example("これは第一歩です。", "Das ist der erste Schritt."),
                Example("大会で第二位になった。", "Ich wurde Zweiter im Wettbewerb.")
            )
        ),
        KanjiCard(
            id = 161,
            kanji = "産",
            meaning = listOf("Produktion", "Geburt"),
            examples = listOf(
                Example("日本は車を多く生産している。", "Japan produziert viele Autos."),
                Example("彼女は元気な赤ちゃんを産んだ。", "Sie hat ein gesundes Baby geboren.")
            )
        ),
        KanjiCard(
            id = 162,
            kanji = "結",
            meaning = listOf("Binden", "Verbinden"),
            examples = listOf(
                Example("彼らは結婚しました。", "Sie haben geheiratet."),
                Example("靴ひもをしっかり結んでください。", "Bitte binde deine Schuhbänder fest.")
            )
        ),
        KanjiCard(
            id = 163,
            kanji = "百",
            meaning = listOf("Hundert"),
            examples = listOf(
                Example("この店には百種類のワインがあります。", "Dieser Laden hat hundert Weinsorten."),
                Example("百円を貸してくれますか？", "Kannst du mir hundert Yen leihen?")
            )
        ),
        KanjiCard(
            id = 164,
            kanji = "派",
            meaning = listOf("Fraktion", "Gruppe"),
            examples = listOf(
                Example("彼は保守派の政治家だ。", "Er ist ein konservativer Politiker."),
                Example("新しい派閥が結成された。", "Eine neue Fraktion wurde gebildet.")
            )
        ),
        KanjiCard(
            id = 165,
            kanji = "点",
            meaning = listOf("Punkt", "Markierung"),
            examples = listOf(
                Example("テストで満点を取った。", "Ich habe in der Prüfung die volle Punktzahl erreicht."),
                Example("重要な点を説明してください。", "Bitte erkläre den wichtigen Punkt.")
            )
        ),
        KanjiCard(
            id = 166,
            kanji = "教",
            meaning = listOf("Lehren", "Unterrichten"),
            examples = listOf(
                Example("彼は数学を教えている。", "Er unterrichtet Mathematik."),
                Example("新しい先生が英語を教えます。", "Der neue Lehrer unterrichtet Englisch.")
            )
        ),
        KanjiCard(
            id = 167,
            kanji = "報",
            meaning = listOf("Bericht", "Nachricht"),
            examples = listOf(
                Example("天気予報を見ましたか？", "Hast du die Wettervorhersage gesehen?"),
                Example("そのニュースは新聞で報道された。", "Die Nachricht wurde in der Zeitung berichtet.")
            )
        ),
        KanjiCard(
            id = 168,
            kanji = "済",
            meaning = listOf("Vollenden", "Bezahlen"),
            examples = listOf(
                Example("宿題はもう済ませました。", "Ich habe meine Hausaufgaben bereits erledigt."),
                Example("彼は借金をすべて返済した。", "Er hat alle seine Schulden zurückgezahlt.")
            )
        ),
        KanjiCard(
            id = 169,
            kanji = "書",
            meaning = listOf("Schreiben", "Buch"),
            examples = listOf(
                Example("日記を書いています。", "Ich schreibe ein Tagebuch."),
                Example("この本はとても面白い。", "Dieses Buch ist sehr interessant.")
            )
        ),
        KanjiCard(
            id = 170,
            kanji = "府",
            meaning = listOf("Regierung", "Behörde"),
            examples = listOf(
                Example("大阪府に住んでいます。", "Ich lebe in der Präfektur Osaka."),
                Example("政府は新しい政策を発表した。", "Die Regierung hat eine neue Politik angekündigt.")
            )
        ),
        KanjiCard(
            id = 171,
            kanji = "活",
            meaning = listOf("Leben", "Aktivität"),
            examples = listOf(
                Example("彼はとても活発な人です。", "Er ist eine sehr aktive Person."),
                Example("新しい生活を始めました。", "Ich habe ein neues Leben begonnen.")
            )
        ),
        KanjiCard(
            id = 172,
            kanji = "原",
            meaning = listOf("Ursprung", "Feld"),
            examples = listOf(
                Example("この理論の原則を説明します。", "Ich werde die Prinzipien dieser Theorie erklären."),
                Example("広い原っぱでピクニックをした。", "Wir haben auf einer weiten Wiese ein Picknick gemacht.")
            )
        ),
        KanjiCard(
            id = 173,
            kanji = "先",
            meaning = listOf("Vorher", "Spitze"),
            examples = listOf(
                Example("先週は忙しかった。", "Letzte Woche war ich beschäftigt."),
                Example("この道の先に駅があります。", "Am Ende dieser Straße ist der Bahnhof.")
            )
        ),
        KanjiCard(
            id = 174,
            kanji = "共",
            meaning = listOf("Gemeinsam", "Zusammen"),
            examples = listOf(
                Example("私たちは共通の趣味があります。", "Wir haben ein gemeinsames Hobby."),
                Example("共に頑張りましょう。", "Lass uns gemeinsam unser Bestes geben.")
            )
        ),
        KanjiCard(
            id = 175,
            kanji = "得",
            meaning = listOf("Gewinnen", "Erlangen"),
            examples = listOf(
                Example("彼は大きな利益を得た。", "Er hat einen großen Gewinn erzielt."),
                Example("試験の結果に満足している。", "Ich bin mit dem Prüfungsergebnis zufrieden.")
            )
        ),
        KanjiCard(
            id = 176,
            kanji = "解",
            meaning = listOf("Verstehen", "Lösen"),
            examples = listOf(
                Example("この問題の解決策を探しています。", "Ich suche eine Lösung für dieses Problem."),
                Example("先生が文法をわかりやすく解説した。", "Der Lehrer hat die Grammatik verständlich erklärt.")
            )
        ),
        KanjiCard(
            id = 177,
            kanji = "名",
            meaning = listOf("Name", "Berühmt"),
            examples = listOf(
                Example("彼の名前は田中です。", "Sein Name ist Tanaka."),
                Example("このレストランは有名です。", "Dieses Restaurant ist berühmt.")
            )
        ),
        KanjiCard(
            id = 178,
            kanji = "交",
            meaning = listOf("Mischen", "Austauschen"),
            examples = listOf(
                Example("国際交流が大切です。", "Internationaler Austausch ist wichtig."),
                Example("二つの文化が交わる。", "Zwei Kulturen vermischen sich.")
            )
        ),
        KanjiCard(
            id = 179,
            kanji = "資",
            meaning = listOf("Ressourcen", "Kapital"),
            examples = listOf(
                Example("新しいビジネスに資金を投資する。", "Ich investiere Kapital in ein neues Geschäft."),
                Example("自然資源を大切にしましょう。", "Lass uns natürliche Ressourcen wertschätzen.")
            )
        ),
        KanjiCard(
            id = 180,
            kanji = "予",
            meaning = listOf("Vorher", "Plan"),
            examples = listOf(
                Example("旅行の予定を決めました。", "Ich habe meine Reisepläne gemacht."),
                Example("予習をしっかりしてください。", "Bitte bereite dich gut vor.")
            )
        ),
        KanjiCard(
            id = 181,
            kanji = "川",
            meaning = listOf("Fluss", "Strom"),
            examples = listOf(
                Example("この川はとても長いです。", "Dieser Fluss ist sehr lang."),
                Example("川で魚を釣りました。", "Ich habe im Fluss Fische gefangen.")
            )
        ),
        KanjiCard(
            id = 182,
            kanji = "向",
            meaning = listOf("Richtung", "Zuwenden"),
            examples = listOf(
                Example("駅の方向はどちらですか？", "In welche Richtung ist der Bahnhof?"),
                Example("彼は前向きな考えを持っている。", "Er hat eine positive Einstellung.")
            )
        ),
        KanjiCard(
            id = 183,
            kanji = "際",
            meaning = listOf("Anlass", "Gelegenheit"),
            examples = listOf(
                Example("来日の際にぜひ連絡してください。", "Bitte melde dich, wenn du nach Japan kommst."),
                Example("この機会を大切にしたい。", "Ich möchte diese Gelegenheit nutzen.")
            )
        ),
        KanjiCard(
            id = 184,
            kanji = "査",
            meaning = listOf("Untersuchung", "Inspektion"),
            examples = listOf(
                Example("警察が事件を調査している。", "Die Polizei untersucht den Fall."),
                Example("書類の内容を確認してください。", "Bitte überprüfe den Inhalt der Dokumente.")
            )
        ),
        KanjiCard(
            id = 185,
            kanji = "勝",
            meaning = listOf("Sieg", "Gewinnen"),
            examples = listOf(
                Example("試合に勝ちました！", "Ich habe das Spiel gewonnen!"),
                Example("勝利を目指して頑張る。", "Ich arbeite hart für den Sieg.")
            )
        ),
        KanjiCard(
            id = 186,
            kanji = "面",
            meaning = listOf("Gesicht", "Fläche"),
            examples = listOf(
                Example("彼の表情は真剣だった。", "Sein Gesichtsausdruck war ernst."),
                Example("この建物は南向きの面が広い。", "Dieses Gebäude hat eine große Südfassade.")
            )
        ),
        KanjiCard(
            id = 187,
            kanji = "委",
            meaning = listOf("Beauftragen", "Komitee"),
            examples = listOf(
                Example("委員会のメンバーとして参加します。", "Ich nehme als Mitglied des Komitees teil."),
                Example("重要な仕事を彼に委ねた。", "Ich habe ihm eine wichtige Aufgabe anvertraut.")
            )
        ),
        KanjiCard(
            id = 188,
            kanji = "告",
            meaning = listOf("Ankündigen", "Informieren"),
            examples = listOf(
                Example("先生に報告をしました。", "Ich habe dem Lehrer Bericht erstattet."),
                Example("新しいルールが告知された。", "Eine neue Regel wurde angekündigt.")
            )
        ),
        KanjiCard(
            id = 189,
            kanji = "軍",
            meaning = listOf("Armee", "Militär"),
            examples = listOf(
                Example("軍隊に所属している。", "Ich gehöre zum Militär."),
                Example("この戦略は軍事的に重要だ。", "Diese Strategie ist militärisch wichtig.")
            )
        ),
        KanjiCard(
            id = 190,
            kanji = "文",
            meaning = listOf("Schrift", "Satz"),
            examples = listOf(
                Example("この文章は難しい。", "Dieser Satz ist schwierig."),
                Example("彼は文学に興味がある。", "Er interessiert sich für Literatur.")
            )
        ),
        KanjiCard(
            id = 191,
            kanji = "反",
            meaning = listOf("Gegenteil", "Widerspruch"),
            examples = listOf(
                Example("彼の意見に反対です。", "Ich bin gegen seine Meinung."),
                Example("この法律は市民の意志に反している。", "Dieses Gesetz widerspricht dem Willen der Bürger.")
            )
        ),
        KanjiCard(
            id = 192,
            kanji = "元",
            meaning = listOf("Ursprung", "Früher"),
            examples = listOf(
                Example("元の場所に戻してください。", "Bitte bringe es an seinen ursprünglichen Platz zurück."),
                Example("元気ですか？", "Wie geht es dir?")
            )
        ),
        KanjiCard(
            id = 193,
            kanji = "重",
            meaning = listOf("Schwer", "Wichtig"),
            examples = listOf(
                Example("この荷物はとても重い。", "Dieses Gepäck ist sehr schwer."),
                Example("重要な会議がある。", "Es gibt eine wichtige Besprechung.")
            )
        ),
        KanjiCard(
            id = 194,
            kanji = "近",
            meaning = listOf("Nah", "Kürzlich"),
            examples = listOf(
                Example("駅はここから近いです。", "Der Bahnhof ist von hier aus nah."),
                Example("最近、日本語を勉強し始めた。", "Ich habe kürzlich angefangen, Japanisch zu lernen.")
            )
        ),
        KanjiCard(
            id = 195,
            kanji = "千",
            meaning = listOf("Tausend"),
            examples = listOf(
                Example("千円札を持っていますか？", "Hast du einen Tausend-Yen-Schein?"),
                Example("この都市には千以上の建物がある。", "In dieser Stadt gibt es mehr als tausend Gebäude.")
            )
        ),
        KanjiCard(
            id = 196,
            kanji = "考",
            meaning = listOf("Denken", "Überlegen"),
            examples = listOf(
                Example("もう一度よく考えてみてください。", "Bitte denke noch einmal gut darüber nach."),
                Example("彼は将来のことを考えている。", "Er denkt über seine Zukunft nach.")
            )
        ),
        KanjiCard(
            id = 197,
            kanji = "判",
            meaning = listOf("Urteil", "Entscheidung"),
            examples = listOf(
                Example("裁判官が判決を下した。", "Der Richter hat ein Urteil gefällt."),
                Example("この問題は慎重に判断すべきだ。", "Dieses Problem sollte sorgfältig beurteilt werden.")
            )
        ),
        KanjiCard(
            id = 198,
            kanji = "認",
            meaning = listOf("Erkennen", "Anerkennen"),
            examples = listOf(
                Example("彼の才能が認められた。", "Sein Talent wurde anerkannt."),
                Example("私はその事実を認識している。", "Ich bin mir dieser Tatsache bewusst.")
            )
        ),
        KanjiCard(
            id = 199,
            kanji = "画",
            meaning = listOf("Bild", "Zeichnen"),
            examples = listOf(
                Example("この映画はとても面白い。", "Dieser Film ist sehr interessant."),
                Example("彼は素晴らしい画家です。", "Er ist ein großartiger Maler.")
            )
        ),
        KanjiCard(
            id = 200,
            kanji = "海",
            meaning = listOf("Meer", "Ozean"),
            examples = listOf(
                Example("夏に海へ行きました。", "Ich bin im Sommer ans Meer gegangen."),
                Example("この町は海に面している。", "Diese Stadt liegt am Meer.")
            )
        )
    )









}