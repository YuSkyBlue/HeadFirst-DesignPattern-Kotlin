package headfirst.chapter02.java;

/** 데이터가 변경되면   실시간으로 갱신 */
interface Observer {
    void update(float temp, float humidity, float pressure);
}