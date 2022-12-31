bridge_length = 2
weight = 10
truck_weights = [7,4,5,6]
tmp_w = []
for x in truck_weights:
    if len(tmp_w) <= weight:
        tmp_w.append(x)
        if